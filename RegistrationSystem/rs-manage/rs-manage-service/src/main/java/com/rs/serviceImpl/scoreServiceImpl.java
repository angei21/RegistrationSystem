package com.rs.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.mapper.TwordscoreMapper;
import com.rs.pojo.Twordscore;
import com.rs.pojo.TwordscoreExample;
import com.rs.pojo.TwordscoreExample.Criteria;
import com.rs.pojo.showWorks;
import com.rs.service.scoreService;

@Service
public class scoreServiceImpl implements scoreService {

	@Autowired
	private TwordscoreMapper scoremapper;

	// 添加作品分数
	public void addScore(Twordscore score) {
		scoremapper.insert(score);
	}

	// 修改作品分数
	public void updateScore(Long sno,Long sid,int scoretotal) {
		Twordscore primaryKey = scoremapper.selectByPrimaryKey(sid);
		primaryKey.setRater(sno.intValue());//评审人
		primaryKey.setScoretotal(scoretotal);//分数
		scoremapper.updateByPrimaryKey(primaryKey);
	}

	// 查看所有作品分数
	public showWorks selectAllScore() {
		TwordscoreExample example = new TwordscoreExample();
		showWorks showWorks = new showWorks();
		showWorks.setAccomplishCount(scoremapper.completedCount());
		showWorks.setNumcount(scoremapper.countByExample(example));
		showWorks.setUnaccomplishCount(scoremapper.uncompletedCount());
		showWorks.setUnaccomplishList(scoremapper.selectUncompleted());
		return showWorks;
	}
	
	// 查看所有作品分数
	public List<Twordscore> selectScores(){
		TwordscoreExample example = new TwordscoreExample();
		return scoremapper.selectByExample(example);
	}

}
