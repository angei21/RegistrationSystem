package com.rs.service;

import java.util.List;

import com.rs.pojo.Twordscore;
import com.rs.pojo.showWorks;

public interface scoreService {
	public void addScore(Twordscore score);// 添加作品分数

	public void updateScore(Long sno,Long sid,int scoretotal);// 修改作品分数

	public showWorks selectAllScore();// 查看所有作品分数
	
	public List<Twordscore> selectScores();// 查看所有作品分数
}
