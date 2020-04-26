package com.rs.service;

import java.util.List;

import com.rs.pojo.Tmatchtype;

public interface tmatchTypeService {
	public void addMatchType(Tmatchtype matchtype);//增加参赛组别
	
	public void deleteMatchType(long tmid);//删除参赛组别
	
	public List<Tmatchtype> getAllMatchType();//获取所有参赛组别
}
