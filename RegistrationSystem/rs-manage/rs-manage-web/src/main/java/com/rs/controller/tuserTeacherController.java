package com.rs.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rs.pojo.Tuser;
import com.rs.pojo.Twordscore;
import com.rs.pojo.showWorks;
import com.rs.service.scoreService;
import com.rs.service.tuserService;

@Controller
@RequestMapping("/userTeacher")
public class tuserTeacherController {
	@Autowired
	private tuserService userService;

	@Autowired
	private scoreService scoreservice;
	
	// 通过职工号获取评委信息
	@RequestMapping(value = "selectsingle", produces = MediaType.ALL_VALUE + ";charset=utf-8")
	public String getUserTeacherInfoBySno(long sno, Model model) {
		// 获取个人信息
		Tuser tuser = userService.getUserInfoBySno(sno);
		model.addAttribute("userInfo", tuser);
		//获取所有的作品信息
		showWorks showworks = scoreservice.selectAllScore();
		if(showworks.getUnaccomplishList()!=null){
			model.addAttribute("showworks", showworks);
		}
		return "judgeindex";
	}
}