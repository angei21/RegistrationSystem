package com.rs.pojo;

import java.util.List;

//用于评委界面展示作品
public class showWorks {
	int accomplishCount;// 已完成
	int unaccomplishCount;// 未完成
	int numcount;// 总数
	List unaccomplishList;// 未完成集合

	public showWorks(int accomplishCount, int unaccomplishCount, int numcount, List unaccomplishList) {
		super();
		this.accomplishCount = accomplishCount;
		this.unaccomplishCount = unaccomplishCount;
		this.numcount = numcount;
		this.unaccomplishList = unaccomplishList;
	}

	public showWorks() {
	}

	public int getAccomplishCount() {
		return accomplishCount;
	}

	public void setAccomplishCount(int accomplishCount) {
		this.accomplishCount = accomplishCount;
	}

	public int getUnaccomplishCount() {
		return unaccomplishCount;
	}

	public void setUnaccomplishCount(int unaccomplishCount) {
		this.unaccomplishCount = unaccomplishCount;
	}

	public int getNumcount() {
		return numcount;
	}

	public void setNumcount(int numcount) {
		this.numcount = numcount;
	}

	public List getUnaccomplishList() {
		return unaccomplishList;
	}

	public void setUnaccomplishList(List unaccomplishList) {
		this.unaccomplishList = unaccomplishList;
	}

}
