package com.rs.serviceImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.rs.mapper.TmatchtypeMapper;
import com.rs.mapper.TsubmitworksMapper;
import com.rs.mapper.TwordscoreMapper;
import com.rs.pojo.Tsubmitworks;
import com.rs.pojo.TsubmitworksExample;
import com.rs.pojo.Twordscore;
import com.rs.service.submitService;
import com.rs.utils.FtpUtil;
import com.rs.utils.IDUtils;

@Service
public class submitServiceImpl implements submitService {

	@Autowired
	private TsubmitworksMapper submitMapper;

	@Autowired
	private TwordscoreMapper scoreMapper;
	
	@Autowired
	private TmatchtypeMapper matchTypeMapper;
	
	@Value("${FTP_ADDRESS}")
	private String FTP_ADDRESS;// FTP服务器hostname
	@Value("${FTP_PORT}")
	private Integer FTP_PORT;// FTP服务器端口
	@Value("${FTP_USER_NAME}")
	private String FTP_USER_NAME;// FTP登录账号
	@Value("${FTP_PASSWORD}")
	private String FTP_PASSWORD;// FTP登录密码
	@Value("${FTP_FILEBASE_PATH}")
	private String FTP_FILEBASE_PATH;// FTP服务器图片基础目录
	@Value("${FILE_BASE_URL}")
	private String FILE_BASE_URL;// 图片服务器的[基础URL]

	// 添加作品
	public void addWork(Tsubmitworks work, MultipartFile fileupload) {
		// 获取原文件名称
		String originalFilename = fileupload.getOriginalFilename();
		// 通过【IDUtils工具类】生成唯一标识作品名
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
			input = fileupload.getInputStream();
			FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USER_NAME, FTP_PASSWORD, FTP_FILEBASE_PATH, filePath,
					filename, input);// 会返回一个boolean值
		} catch (IOException e) {
			e.printStackTrace();
		}
		work.setSubmitpath(FILE_BASE_URL + filePath + "/" + filename);
		submitMapper.insert(work);
		
		//往作品（打分）表添加数据
		Long teamid = work.getTeamid();//团队号
		Long tmid = work.getTmid();//参赛类别号
		String firstwriter = work.getFirstwriter();//第一作者名
		String workname = work.getWorkname();//作品名
		String submitpath = work.getSubmitpath();//作品
		Twordscore twordscore = new Twordscore();
		twordscore.setMname(matchTypeMapper.getTypenameByTypeId(tmid));
		twordscore.setTeamid(teamid);
		twordscore.setFirstwriter(firstwriter);
		twordscore.setWorkname(workname);
		twordscore.setSubmitpath(submitpath);
		scoreMapper.insert(twordscore);
	}

	// 根据Id查找作品
	public Tsubmitworks selectWork(long wid) {
		return submitMapper.selectByPrimaryKey(wid);
	}

	// 查看所有作品
	public List<Tsubmitworks> selectallWorks() {
		TsubmitworksExample example = new TsubmitworksExample();
		return submitMapper.selectByExample(example);
	}

}
