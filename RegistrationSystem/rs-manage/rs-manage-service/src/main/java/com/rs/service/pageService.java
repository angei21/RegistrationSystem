package com.rs.service;

import javax.servlet.http.HttpServletRequest;

public interface pageService {

	public String getLoginURL();// 获取用户登录的URL

	public String getLogoffURL(HttpServletRequest request);// 获取注销用户的URL
}
