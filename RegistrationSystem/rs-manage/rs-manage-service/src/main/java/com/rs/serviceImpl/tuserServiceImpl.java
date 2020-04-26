package com.rs.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.rs.mapper.TuserMapper;
import com.rs.pojo.Tuser;
import com.rs.service.tuserService;
import com.rs.utils.HttpClientUtil;
import com.rs.utils.RsResult;

@Service
public class tuserServiceImpl implements tuserService {

	@Autowired
	private TuserMapper userMapper;

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

	@Value("${SSO_BASE_URL}")
	private String SSO_BASE_URL;// SSO系统的基础URL
	@Value("${SSO_USER_TOKEN}")
	private String SSO_USER_TOKEN;// 通过token获取用户信息的子URL
	@Value("${SSO_USER_GETBYSNO}")
	private String SSO_USER_GETBYSNO;// 通过学号获取用户信息的子URL
	@Value("${SSO_USER_GETALL}")
	private String SSO_USER_GETALL;// 获取所有学生信息的信息集的子URL
	@Value("${SSO_USER_LOGIN}")
	private String SSO_USER_LOGIN;// 用户登录的子URL

	// 通过学号获取学生/职工信息
	public Tuser getUserInfoBySno(long sno) {
		try {
			HashMap<String, String> param = new HashMap<>();
			param.put("sno", sno + "");
			// 调用sso系统的服务，通过学号获取用户信息
			String json = HttpClientUtil.doGet(SSO_BASE_URL + SSO_USER_GETBYSNO, param);
			RsResult result = RsResult.formatToPojo(json, Tuser.class);
			if (result.getStatus() == 200) {
				Tuser user = (Tuser) result.getData();
				return user;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 获取所有[学生信息]
	public List<Tuser> getAllUserInfo() {
		try {
			// 调用sso系统的服务，获取所有学生信息的信息集
			String json = HttpClientUtil.doGet(SSO_BASE_URL + SSO_USER_GETALL);
			RsResult result = RsResult.formatToList(json, Tuser.class);
			if (result.getStatus() == 200) {
				ArrayList<Tuser> list = (ArrayList<Tuser>) result.getData();
				return list;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ArrayList<Tuser>();
	}

	// 通过token获取用户信息
	public Tuser getUserByToken(String token) {
		try {
			// 调用sso系统的服务，根据token取用户信息
			String json = HttpClientUtil.doGet(SSO_BASE_URL + SSO_USER_TOKEN + token);
			// 把json转换成RsResult
			RsResult result = RsResult.formatToPojo(json, Tuser.class);
			if (result.getStatus() == 200) {
				Tuser user = (Tuser) result.getData();
				return user;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//获取SSO系统的基础URL
	public String getSSO_BASE_URL() {
		return SSO_BASE_URL;
	}
	
	//获取用户登录的子URL
	public String getSSO_USER_LOGIN_URL(){
		return SSO_USER_LOGIN;
	}

}
