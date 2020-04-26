package com.rs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.rs.pojo.Documentstock;
import com.rs.service.documentService;

@Controller
@RequestMapping("/document")
public class tdocumentController {

	@Autowired
	private documentService dservice;

	// 添加文件
	@RequestMapping("/add")
	public String addDocument(Documentstock document,Long sno,MultipartFile imageupload, MultipartFile fileupload) {
		dservice.addDocument(document,imageupload,fileupload);
		return "redirect:/useradmin/selectsingle?sno="+sno;
	}

	// 删除文件
	@RequestMapping("/delete")
	public String deleteDocument(long did,long sno) {
		dservice.deleteDocument(did);
		return "redirect:/useradmin/selectsingle?sno="+sno;
	}

	// 删除所有文件
	@RequestMapping("/deleteall")
	public void deleteAllDocument() {
	}

	// 查询所有文件
	@RequestMapping("/selectall")
	public List<Documentstock> getAllDocuments() {
		List<Documentstock> list = dservice.getAllDocuments();
		return list;
	}
}
