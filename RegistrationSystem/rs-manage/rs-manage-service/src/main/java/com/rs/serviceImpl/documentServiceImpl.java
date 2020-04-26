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

import com.rs.mapper.DocumentstockMapper;
import com.rs.pojo.Documentstock;
import com.rs.pojo.DocumentstockExample;
import com.rs.service.documentService;
import com.rs.utils.FtpUtil;
import com.rs.utils.IDUtils;

@Service
public class documentServiceImpl implements documentService {

	@Autowired
	private DocumentstockMapper dstockmapper;

	@Value("${FTP_ADDRESS}")
	private String FTP_ADDRESS;// FTP服务器hostname
	@Value("${FTP_PORT}")
	private Integer FTP_PORT;// FTP服务器端口
	@Value("${FTP_USER_NAME}")
	private String FTP_USER_NAME;// FTP登录账号
	@Value("${FTP_PASSWORD}")
	private String FTP_PASSWORD;// FTP登录密码
	@Value("${FTP_FILEBASE_PATH}")
	private String FTP_FILEBASE_PATH;// FTP服务器文件基础目录
	@Value("${FILE_BASE_URL}")
	private String FILE_BASE_URL;// 文件服务器的[基础URL]
	@Value("${FTP_IMAGEBASE_PATH}")
	private String FTP_IMAGEBASE_PATH;// FTP服务器图片基础目录
	@Value("${IMAGE_BASE_URL}")
	private String IMAGE_BASE_URL;// 图片服务器的[基础URL]

	// 添加文件
	public void addDocument(Documentstock document, MultipartFile imageupload, MultipartFile fileupload) {
		// 获取原文件名称
		String originalFilename = imageupload.getOriginalFilename();
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
			input = imageupload.getInputStream();
			FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USER_NAME, FTP_PASSWORD, FTP_IMAGEBASE_PATH, filePath,
					filename, input);// 会返回一个boolean值
		} catch (IOException e) {
			e.printStackTrace();
		}
		document.setDid(IDUtils.genTeamId());
		document.setDpicture(IMAGE_BASE_URL + filePath + "/" + filename);

		// 获取原文件名称
		String originalFilename2 = fileupload.getOriginalFilename();
		// 通过【IDUtils工具类】生成唯一标识作品名
		String newFilename2 = IDUtils.genImageName();
		// 获取原图片名的后缀名（不带"."）
		String extName2 = FilenameUtils.getExtension(originalFilename2);
		// FTP服务器文件存放路径。例如分日期存放：/2018/12/08。文件的路径为basePath+filePath
		String filePath2 = new DateTime().toString("/yyyy/MM/dd");
		// 新图片名
		String filename2 = newFilename2 + "." + extName2;
		try {
			input = fileupload.getInputStream();
			FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USER_NAME, FTP_PASSWORD, FTP_FILEBASE_PATH, filePath2,
					filename2, input);// 会返回一个boolean值
		} catch (IOException e) {
			e.printStackTrace();
		}
		document.setDpath(FILE_BASE_URL + filePath2 + "/" + filename2);

		dstockmapper.insert(document);
	}

	// 删除文件
	public void deleteDocument(long did) {
		dstockmapper.deleteByPrimaryKey(did);
	}

	// 删除所有文件
	public void deleteAllDocument() {
	}

	// 查询所有文件
	public List<Documentstock> getAllDocuments() {
		DocumentstockExample example = new DocumentstockExample();
		List<Documentstock> list = dstockmapper.selectByExample(example);
		return list;
	}

}
