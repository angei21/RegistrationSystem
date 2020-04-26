package com.rs.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.rs.pojo.Tuser;

public interface tuserService {
	public Tuser getUserInfoBySno(long sno);// 通过学号获取学生/职工信息   [修改逻辑]

	public List<Tuser> getAllUserInfo();// 获取所有学生信息[修改逻辑]
	
	public Tuser getUserByToken(String token);// 通过token获取用户信息 
	
	public String getSSO_BASE_URL();// 获取SSO系统的基础URL
	
	public String getSSO_USER_LOGIN_URL();// 获取用户登录的子URL

}
