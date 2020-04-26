package com.rs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.util.StringUtils;
import com.rs.service.pageService;
import com.rs.utils.CookieUtils;
import com.rs.utils.HttpClientUtil;

@Controller
public class pageController {

	@Autowired
	private pageService pageservice;

	// 访问首页
	@RequestMapping("/")
	public String showIndex() {
		String loginUrl = pageservice.getLoginURL();
		return "redirect:" + loginUrl;
	}

	// 注销账号
	@RequestMapping("/off")
	public String logoff(HttpServletRequest request) {
		String logoffURL = pageservice.getLogoffURL(request);
		return "redirect:" + logoffURL;
	}

}
