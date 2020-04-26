package com.rs.sso.serviceImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.rs.mapper.TuserMapper;
import com.rs.pojo.Tuser;
import com.rs.pojo.TuserExample;
import com.rs.pojo.TuserExample.Criteria;
import com.rs.sso.dao.JedisClient;
import com.rs.sso.service.UserService;
import com.rs.utils.CookieUtils;
import com.rs.utils.FtpUtil;
import com.rs.utils.IDUtils;
import com.rs.utils.JsonUtils;
import com.rs.utils.RsResult;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private TuserMapper userMapper;
	
	@Autowired
	private JedisClient jedisDao;

	@Value("${REDIS_USER_SESSION_KEY}")
	private String REDIS_USER_SESSION_KEY;

	@Value("${SSO_SESSION_EXPIRE}")
	private Integer SSO_SESSION_EXPIRE;

	@Value("${FTP_ADDRESS}")
	private String FTP_ADDRESS;// FTP服务器hostname
	@Value("${FTP_PORT}")
	private Integer FTP_PORT;// FTP服务器端口
	@Value("${FTP_USER_NAME}")
	private String FTP_USER_NAME;// FTP登录账号
	@Value("${FTP_PASSWORD}")
	private String FTP_PASSWORD;// FTP登录密码
	@Value("${FTP_IMAGEBASE_PATH}")
	private String FTP_IMAGEBASE_PATH;// FTP服务器图片基础目录
	@Value("${IMAGE_BASE_URL}")
	private String IMAGE_BASE_URL;// 图片服务器的[基础URL]

	/*
	 * 新用户注册
	 * 
	 * @param user 封装的user对象内容
	 */
	public RsResult register(Tuser user, MultipartFile uploadFile) {
		try {
			// 获取原图片名称
			String originalFilename = uploadFile.getOriginalFilename();
			// 通过【IDUtils工具类】生成唯一标识图片名
			String newFilename = IDUtils.genImageName();
			// 获取原图片名的后缀名（不带"."）
			String extName = FilenameUtils.getExtension(originalFilename);
			// FTP服务器文件存放路径。例如分日期存放：/2018/12/08。文件的路径为basePath+filePath
			String filePath = new DateTime().toString("/yyyy/MM/dd");
			// 新图片名
			String filename = newFilename + "." + extName;
			// 流
			InputStream input;
			try {
				input = uploadFile.getInputStream();
				FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USER_NAME, FTP_PASSWORD, FTP_IMAGEBASE_PATH, filePath,
						filename, input);
			} catch (IOException e) {
				e.printStackTrace();
			}
			user.setSportaid(IMAGE_BASE_URL + filePath + "/" + filename);
			// 用户密码加密存储（借助使用spring框架提供的DigestUtils工具类进行该操作）
			user.setSpassword(DigestUtils.md5DigestAsHex(user.getSpassword().getBytes()));
			userMapper.insert(user);
			return RsResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return RsResult.build(400, "注册失败. 请校验数据后请再提交数据.");
		}
	}

	/*
	 * 检查用户是否存在
	 * 
	 * @Param sno 学号/职工号
	 * 
	 * @Param spassword 密码
	 * 
	 * @Param statue 角色
	 * 
	 */
	public RsResult login(Long sno, String spassword, Integer statue, HttpServletRequest request,
			HttpServletResponse response) {
		TuserExample example = new TuserExample();
		Criteria criteria = example.createCriteria();
		criteria.andSnoEqualTo(sno);
		criteria.andStatueEqualTo(statue);
		List<Tuser> list = userMapper.selectByExample(example);
		if (list == null || list.size() == 0) {// 说明数据库没有改账户信息
			return RsResult.build(400, "未查询到该账户的相关信息");
		}
		Tuser user = list.get(0);
		if (user.getSpassword().equals(DigestUtils.md5DigestAsHex(spassword.getBytes()))) {// 密码匹配
			// 使用UUID生成token
			String token = UUID.randomUUID().toString();
			// 保存用户信息到redis之前，把用户对象中的密码清空。
			user.setSpassword(null);
			// 把用户信息写入redis
			jedisDao.set(REDIS_USER_SESSION_KEY + ":" + token, JsonUtils.objectToJson(user));
			// 设置过期时间
			jedisDao.expire(REDIS_USER_SESSION_KEY + ":" + token, SSO_SESSION_EXPIRE);

			// 添加cookie的相关逻辑，若cookie不进行设置，其默认为关闭浏览器就失效
			CookieUtils.setCookie(request, response, "RS_TOKEN", token);

			return RsResult.ok(token);
		} else {// 密码不匹配
			return RsResult.build(400, "用户名或密码不正确");
		}
	}

	/*
	 * 用户通过token获取用户信息
	 * 
	 * @param token 唯一标识的token值(类似于sessionId)
	 */
	public RsResult getUserInfoByToken(String token) {
		String json = jedisDao.get(REDIS_USER_SESSION_KEY + ":" + token);
		if (StringUtils.isEmpty(json)) {
			return RsResult.build(400, "您的登录身份已过期");
		}
		// 重置过期时间
		jedisDao.expire(REDIS_USER_SESSION_KEY + ":" + token, SSO_SESSION_EXPIRE);

		Tuser userInfo = JsonUtils.jsonToPojo(json, Tuser.class);
		return RsResult.ok(userInfo);
	}

	/*
	 * 用户安全退出登录状态
	 * 
	 * @param token 唯一标识的token值(类似于sessionId)
	 */
	public RsResult logout(String token) {
		jedisDao.del(REDIS_USER_SESSION_KEY + ":" + token);
		return RsResult.ok();
	}

	/*
	 * 获取所有[学生信息]
	 * 
	 */
	public RsResult getAllUserInfo() {
		TuserExample example = new TuserExample();
		Criteria criteria = example.createCriteria();
		// 添加条件：学生身份标识为1
		criteria.andStatueEqualTo(1);
		List<Tuser> list = userMapper.selectByExample(example);
		return RsResult.ok(list);
	}

	/*
	 * 通过学号获取学生/职工信息
	 * 
	 * @Param sno 学号/职工号
	 * 
	 */
	public RsResult getUserInfoBySno(long sno) {
		Tuser tuser = userMapper.selectByPrimaryKey(sno);
		return RsResult.ok(tuser);
	}

}
