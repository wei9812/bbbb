package com.panshi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.panshi.domain.User;
import com.panshi.vo.Vo;

@Mapper
public interface UserMapper{
	
	
	List<User> query(@Param("index") Integer index,@Param("vo") Vo vo);
		
	int queryCount(@Param("vo") Vo vo);
	
	void add(User user);
		
	void delete(@Param("deleteIds") String deleteIds);
	
	void update(User user);
	
	User login(User user);
}
