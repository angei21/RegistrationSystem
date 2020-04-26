package com.rs.sso.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.rs.pojo.Tuser;
import com.rs.sso.service.UserService;
import com.rs.utils.ExceptionUtil;
import com.rs.utils.RsResult;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	/*
	 * 新用户注册
	 * 
	 * @param user 封装的user对象内容
	 * 
	 * @return RsResult
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(Tuser user, MultipartFile uploadFile) {
		RsResult result = userService.register(user, uploadFile);
		return "redirect:/page/login";
	}

	/*
	 * 用户登录
	 * 
	 * @param sno 登录学号
	 * 
	 * @param spassword 登录密码
	 *
	 * @param statue 角色ID
	 * 
	 * @return RsResult 若登录成功，带回token
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public RsResult login(String username, String password, Integer statue, HttpServletRequest request,
			HttpServletResponse response) {
		try {
			return userService.login(Long.valueOf(username), password, statue, request, response);
		}catch (Exception e) {
			return RsResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	/*
	 * 用户通过token获取用户信息
	 * 
	 * @param token 唯一标识的token值(类似于sessionId)
	 */
	@RequestMapping("/token/{token}")
	@ResponseBody
	public RsResult getUserInfoByToken(@PathVariable String token) {
		RsResult result = null;
		try {
			result = userService.getUserInfoByToken(token);
			return result;
		} catch (Exception e) {
			return RsResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	/*
	 * 用户安全退出登录状态
	 * 
	 * @param token 唯一标识的token值(类似于sessionId)
	 */
	@RequestMapping("/logout/{token}")
	@ResponseBody
	public RsResult logout(@PathVariable String token) {
		RsResult result = null;
		try {
			return userService.logout(token);
		} catch (Exception e) {
			return RsResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	/*
	 * 获取所有学生信息的信息集
	 */
	@RequestMapping("/selectall")
	@ResponseBody
	public RsResult getAllUserInfo() {
		try {
			RsResult ans = userService.getAllUserInfo();
			return ans;
		} catch (Exception e) {
			return RsResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	/*
	 * 通过学号获取用户信息
	 * 
	 * @param sno 用户ID
	 */
	@RequestMapping("/selectsingle")
	@ResponseBody
	public RsResult getUserInfoBySno(long sno) {
		try {
			RsResult ans = userService.getUserInfoBySno(sno);
			return ans;
		} catch (Exception e) {
			return RsResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

}
