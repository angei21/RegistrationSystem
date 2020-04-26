package com.rs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.rs.pojo.Documentstock;
import com.rs.pojo.Tmatchtype;
import com.rs.pojo.Tteam;
import com.rs.pojo.Tuser;
import com.rs.pojo.showTeams;
import com.rs.service.documentService;
import com.rs.service.tmatchTypeService;
import com.rs.service.tteamService;
import com.rs.service.tuserService;
import com.rs.utils.pageBean;

/*本界面针对学生*/
@Controller
@RequestMapping("/user")
public class tuserController {

	@Autowired
	private tuserService userService;

	@Autowired
	private tteamService teamService;

	@Autowired
	private tmatchTypeService typeService;

	@Autowired
	private documentService documentservice;

	// 通过学号获取学生信息
	@RequestMapping(value = "selectsingle", produces = MediaType.ALL_VALUE + ";charset=utf-8")
	public String getUserInfoBySno(long sno, @RequestParam(defaultValue = "1") String currentPage, Model model) {
		// 获取个人信息
		Tuser tuser = userService.getUserInfoBySno(sno);
		model.addAttribute("userInfo", tuser);
		// 获取个人团队信息
		Tteam myTeamInfo = teamService.selectTeamBySno(sno);
		if (myTeamInfo != null) {
			model.addAttribute("myTeamInfo", myTeamInfo);
		}

		// 获取所有团队信息
		pageBean<showTeams> pagebean = new pageBean<showTeams>();
		pagebean.setCurrentPage(Integer.parseInt(currentPage));
		teamService.selectallTeam(pagebean);
		if (pagebean.getList() != null) {
			model.addAttribute("pagebean", pagebean);
		}

		// 获取所有赛事类别信息
		List<Tmatchtype> allMatchType = typeService.getAllMatchType();
		if (allMatchType != null) {
			model.addAttribute("allMatchType", allMatchType);
		}

		// 获取所有文件信息
		List<Documentstock> documentsList = documentservice.getAllDocuments();
		if (documentsList != null) {
			model.addAttribute("documentsList", documentsList);
		}

		return "studentindex";// 转向学生首页
	}

	// 获取所有[学生信息]
	@RequestMapping("/selectall")
	public List<Tuser> getAllUserInfo() {
		return userService.getAllUserInfo();
	}

}
