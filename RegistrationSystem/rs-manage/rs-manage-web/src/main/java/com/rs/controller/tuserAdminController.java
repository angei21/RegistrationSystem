package com.rs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rs.pojo.Documentstock;
import com.rs.pojo.Tteam;
import com.rs.pojo.Tuser;
import com.rs.pojo.Twordscore;
import com.rs.service.documentService;
import com.rs.service.scoreService;
import com.rs.service.tmatchTypeService;
import com.rs.service.tteamService;
import com.rs.service.tuserService;

/*本界面针对管理员*/
@Controller
@RequestMapping("/useradmin")
public class tuserAdminController {

	@Autowired
	private tuserService userService;

	@Autowired
	private tteamService teamService;

	@Autowired
	private tmatchTypeService typeService;
	
	@Autowired
	private scoreService scoreservice;
	
	@Autowired
	private documentService documentservice;

	// 通过学号获取学生信息
	@RequestMapping(value = "selectsingle", produces = MediaType.ALL_VALUE + ";charset=utf-8")
	public String getUserInfoBySno(long sno, Model model) {
		// 获取管理员个人信息
		Tuser tuser = userService.getUserInfoBySno(sno);
		model.addAttribute("userInfo", tuser);
		// 获取所有参赛人员信息
		List<Tuser> allUserInfo = userService.getAllUserInfo();
		if (allUserInfo != null) {
			model.addAttribute("allUserInfo", allUserInfo);
		}
		// 获取所有作品分数及相关信息
		List<Twordscore> showworks = scoreservice.selectScores();
		if (showworks != null) {
			model.addAttribute("showworks", showworks);
		}
		//获取所有参赛团队的信息
		List<Tteam> teamlist = teamService.selectallTeam();
		if (teamlist != null) {
			model.addAttribute("teamlist", teamlist);
		}
		//获取所有文件信息
		List<Documentstock> documentsList = documentservice.getAllDocuments();
		if (documentsList != null) {
			model.addAttribute("documentsList", documentsList);
		}
		
		return "adminindex";// 转向管理员首页
	}

}
