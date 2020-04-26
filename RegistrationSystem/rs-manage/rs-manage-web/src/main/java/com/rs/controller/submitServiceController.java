package com.rs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.rs.pojo.Tsubmitworks;
import com.rs.service.submitService;

@Controller
@RequestMapping("/work")
public class submitServiceController {
	@Autowired
	private submitService submitservice;

	// 添加作品
	@RequestMapping("/add")
	public String addWork(Tsubmitworks work, MultipartFile fileupload) {
		submitservice.addWork(work,fileupload);
		Long sno = work.getSno();//学号
		return "redirect:/user/selectsingle?sno=" + sno;
		
	}

	// 根据Id查找作品
	@RequestMapping("/select")
	public Tsubmitworks selectWork(long wid) {
		return submitservice.selectWork(wid);
	}

	// 查看所有作品
	@RequestMapping("/selectall")
	public List<Tsubmitworks> selectallWorks() {
		return submitservice.selectallWorks();
	}
}
