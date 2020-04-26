package com.rs.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

	/*
	 * 跳转至登录界面
	 * 
	 * @param redirect 登录页面回调url 当登录成功后若有回调，js的逻辑中会进行页面回调
	 */
	@RequestMapping("/login")
	public String login(String redirect,Model model) {
		model.addAttribute("redirect", redirect);
		return "login";
	}
	
	/*
	 * 跳转至注册界面
	 */
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
}
