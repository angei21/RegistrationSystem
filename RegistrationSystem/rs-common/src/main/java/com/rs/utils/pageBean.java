package com.rs.utils;

import java.util.List;

public class pageBean<T> {
	private int currentPage;
	private int pageCount = 8;
	private List<T> list = null;
	private int totalCount;
	private int totalPage;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getTotalCount() {
		return totalCount;

	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		if (totalCount % pageCount == 0) {
			return totalCount / pageCount;
		} else {
			return totalCount / pageCount + 1;
		}
	}

}
