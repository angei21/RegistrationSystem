package com.rs.serviceImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.rs.service.pageService;
import com.rs.utils.CookieUtils;
import com.rs.utils.HttpClientUtil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class pageServiceImpl implements pageService {

	@Value("${SSO_BASE_URL}")
	private String SSO_BASE_URL;// SSO系统的基础URL
	@Value("${SSO_USER_LOGIN}")
	private String SSO_USER_LOGIN;// 用户登录的子URL
	@Value("${SSO_USER_LOGOUT}")
	private String SSO_USER_LOGOUT;// 用户注销账号的子URL

	// 获取用户登录的URL
	public String getLoginURL() {
		return SSO_BASE_URL + SSO_USER_LOGIN;
	}

	// 获取注销用户的URL
	public String getLogoffURL(HttpServletRequest request) {
		// 使用Cookie工具类获取token值
		String token = CookieUtils.getCookieValue(request, "RS_TOKEN");
		// 调用sso系统的服务，根据token删除指定的用户信息
		HttpClientUtil.doGet(SSO_BASE_URL + SSO_USER_LOGOUT + token);
		// 返回跳往登录页面的URL
		return SSO_BASE_URL + SSO_USER_LOGIN;
	}

}
