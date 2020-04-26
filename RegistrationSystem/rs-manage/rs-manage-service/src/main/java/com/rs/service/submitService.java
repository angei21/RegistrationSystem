package com.rs.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.rs.pojo.Tsubmitworks;

public interface submitService {
public void addWork(Tsubmitworks work, MultipartFile fileupload);//添加作品
	
	public Tsubmitworks selectWork(long wid);//根据Id查找作品
	
	public List<Tsubmitworks> selectallWorks();//查看所有作品
}
