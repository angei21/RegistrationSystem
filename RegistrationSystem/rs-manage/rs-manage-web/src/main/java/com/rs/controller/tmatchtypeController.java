package com.rs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rs.pojo.Tmatchtype;
import com.rs.service.tmatchTypeService;

@Controller
@RequestMapping("/matchtype")
public class tmatchtypeController {

	@Autowired
	private tmatchTypeService typeService;
	
	// 增加参赛组别
	@RequestMapping("/add")
	public void addMatchType(Tmatchtype matchtype) {
		typeService.addMatchType(matchtype);
	}

	// 删除参赛组别
	@RequestMapping("/delete")
	public void deleteMatchType(long tmid) {
		typeService.deleteMatchType(tmid);
	}

	// 获取所有参赛组别
	@RequestMapping("/all")
	public List<Tmatchtype> getAllMatchType() {
		return typeService.getAllMatchType();
	}

}
