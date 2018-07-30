package com.panshi.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.panshi.domain.Layui;
import com.panshi.domain.User;
import com.panshi.mapper.UserMapper;
import com.panshi.service.HelloService;
import com.panshi.vo.Vo;

@Service
public class HelloServiceImpl implements  HelloService{
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public Layui query(Vo vo) {
		
		Integer index=(vo.getPage()-1) * vo.getLimit();
		Layui l=new Layui();
		l.setData(userMapper.query(index,vo));
		l.setCount(userMapper.queryCount(vo));
		return l;
	}

	@Override
	public void add(User user) {		
		userMapper.add(user);
	}

	@Override
	public void delete(String deleteIds) {
		userMapper.delete(deleteIds);
	}

	@Override
	public void update(User user) {
		userMapper.update(user);
	}

	@Override
	public User login(User user) {		
		return userMapper.login(user);
	}
		
}
