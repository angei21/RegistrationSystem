package com.rs.sso.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

import com.rs.pojo.Tuser;
import com.rs.utils.RsResult;

public interface UserService {

	public RsResult register(Tuser user, MultipartFile uploadFile); // 新用户注册

	public RsResult login(Long sno, String spassword, Integer statue, HttpServletRequest request,
			HttpServletResponse response);// 用户登录

	public RsResult getUserInfoByToken(String token);// 用户通过token获取用户信息

	public RsResult logout(String token);// 用户安全退出登录状态

	public RsResult getAllUserInfo();// 获取所有学生信息

	public RsResult getUserInfoBySno(long sno);// 通过学号获取学生/职工信息

}
