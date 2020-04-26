package com.rs.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rs.pojo.Tteam;
import com.rs.service.tteamService;

@Controller
@RequestMapping("/team")
public class tteamController {

	@Autowired
	private tteamService teamService;

	// 添加新团队
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addTeam(Tteam team, Long sno) {
		teamService.addTeam(team);
		return "redirect:/user/selectsingle?sno=" + sno;
	}

	// 根据团队Id查找团队
	@RequestMapping("/select")
	public Tteam selectTeam(long teamid) {
		return teamService.selectTeam(teamid);
	}

	// 根据团队组长的学号查找团队
	public Tteam selectTeamBySno(long sno) {
		return teamService.selectTeamBySno(sno);
	}

	// 查看所有团队
	@RequestMapping("/selectall")
	public void selectallTeam(String currentPage) {
		/*pageBean<showTeams> pagebean = new pageBean<showTeams>();
		if (StringUtils.isBlank(currentPage)) {//初次访问
			currentPage = "1";
		}
		pagebean.setCurrentPage(Integer.parseInt(currentPage));
		teamService.selectallTeam(pagebean);*/
	}
}
