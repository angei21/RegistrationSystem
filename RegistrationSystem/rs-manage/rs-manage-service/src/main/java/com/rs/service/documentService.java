package com.rs.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.rs.pojo.Documentstock;

public interface documentService {
	public void addDocument(Documentstock document, MultipartFile imageupload,MultipartFile fileupload);//添加文件
	
	public void deleteDocument(long did);//删除文件
	
	public void deleteAllDocument();//删除所有文件
	
	public List<Documentstock> getAllDocuments();//查询所有文件
	
}
