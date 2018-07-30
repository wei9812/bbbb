package com.panshi.vo;

public class Vo {
	
	
	private int page;
	
	private int limit;
	
	private String userName;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Vo [page=" + page + ", limit=" + limit + ", userName=" + userName + "]";
	}
	
	
}
