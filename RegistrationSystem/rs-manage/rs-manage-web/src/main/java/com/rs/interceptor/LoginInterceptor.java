package com.rs.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.rs.pojo.Tuser;
import com.rs.service.tuserService;
import com.rs.utils.CookieUtils;

public class LoginInterceptor implements HandlerInterceptor {

	@Autowired
	private tuserService userService;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 进入拦截
		// 使用Cookie工具类获取token值
		String token = CookieUtils.getCookieValue(request, "RS_TOKEN");
		// 通过获取token用户信息
		Tuser userInfo = userService.getUserByToken(token);
		if (userInfo == null) {// 获取失败，转向登录界面
			// 重定向至登录界面
			response.sendRedirect(userService.getSSO_BASE_URL() + userService.getSSO_USER_LOGIN_URL());
			return false;
		}
		// 将用户信息保存至request中
		request.setAttribute("user", userInfo);
		// 获取用户信息成功，放行
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
	}

}
