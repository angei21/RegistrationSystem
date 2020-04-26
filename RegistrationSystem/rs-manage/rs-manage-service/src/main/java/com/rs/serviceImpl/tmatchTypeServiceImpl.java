package com.rs.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.mapper.TmatchtypeMapper;
import com.rs.pojo.Tmatchtype;
import com.rs.pojo.TmatchtypeExample;
import com.rs.service.tmatchTypeService;

@Service
public class tmatchTypeServiceImpl implements tmatchTypeService {

	@Autowired
	private TmatchtypeMapper matchtypeMapper;
	
	//增加参赛组别
	public void addMatchType(Tmatchtype matchtype) {
		matchtypeMapper.insert(matchtype);
	}

	//删除参赛组别
	public void deleteMatchType(long tmid) {
		matchtypeMapper.deleteByPrimaryKey(tmid);
	}

	//获取所有参赛组别
	public List<Tmatchtype> getAllMatchType() {
		TmatchtypeExample example = new TmatchtypeExample();
		List<Tmatchtype> list = matchtypeMapper.selectByExample(example);
		return list;
	}

}
