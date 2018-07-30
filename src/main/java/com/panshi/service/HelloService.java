package com.panshi.service;

import com.panshi.domain.Layui;
import com.panshi.domain.User;
import com.panshi.vo.Vo;

public interface HelloService {
	
	Layui query(Vo vo);
	
	void add(User user);
	
	void delete(String deleteIds);
	
	void update(User user);
	
	User login(User user);
}
