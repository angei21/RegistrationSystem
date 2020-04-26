package com.rs.service;


import java.util.List;

import com.rs.pojo.Tteam;
import com.rs.pojo.showTeams;
import com.rs.utils.pageBean;

public interface tteamService {
	public void addTeam(Tteam team);//添加新团队
	
	public Tteam selectTeam(long teamid);//根据团队Id查找团队
	
	public Tteam selectTeamBySno(long sno);//根据团队组长的学号查找团队
	
	public void selectallTeam(pageBean<showTeams> pagebean);//查看所有团队
	
	public List<Tteam> selectallTeam();//查看所有团队
}
