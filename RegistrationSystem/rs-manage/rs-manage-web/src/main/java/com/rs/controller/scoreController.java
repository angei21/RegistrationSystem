package com.rs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rs.pojo.Twordscore;
import com.rs.pojo.showWorks;
import com.rs.service.scoreService;

@Controller
@RequestMapping("/score")
public class scoreController {
	
	@Autowired
	private scoreService scoreservice;

	// 添加作品分数
	public void addScore(Twordscore score) {
		scoreservice.addScore(score);
	}

	// 修改作品分数
	@RequestMapping("/update")
	public String updateScore(Long sno,Long sid,int scoretotal) {
		scoreservice.updateScore(sno, sid, scoretotal);
		return "redirect:/userTeacher/selectsingle?sno=" + sno;
	}

	// 查看所有作品分数
	public showWorks selectAllScore() {
		return scoreservice.selectAllScore();
	}
}
