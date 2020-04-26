package com.rs.pojo;

//用于团队信息显示
public class showTeams {
	private Long teamId;//团队Id

	private String headname;//队长名

	private int count;//人数

	public showTeams() {
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public String getHeadname() {
		return headname;
	}

	public void setHeadname(String headname) {
		this.headname = headname;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
