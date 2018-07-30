package com.panshi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.panshi.domain.Layui;
import com.panshi.domain.User;
import com.panshi.service.HelloService;
import com.panshi.vo.Vo;

@RestController
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/query")
	public Layui query(@RequestBody Vo vo) {
		return helloService.query(vo);
	}
	
	@PostMapping("/add")
	public Layui add(@RequestBody User user) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("--------进入新增----------");
		Layui l=new Layui();
		try {
			helloService.add(user);
			l.setCode(1);
		} catch (Exception e) {
			l.setCode(0);
			l.setMsg(e.getMessage());
		}
		return l;
	}
	
	@RequestMapping("/deleteUser")
	public Layui deleteUser(@RequestParam("id") String deleteIds) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("--------进入删除----------");
		Layui l=new Layui();
		try {
			helloService.delete(deleteIds);
			l.setCode(1);
		} catch (Exception e) {
			l.setCode(0);
			l.setMsg(e.getMessage());
		}
		return l;
	}
	
	@RequestMapping("/updateUser")
	public Layui updateUser(@RequestBody User user) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("-----------进入修改----------");
		
		Layui l=new Layui();
		try {
			helloService.update(user);
			l.setCode(1);
		} catch (Exception e) {
			l.setCode(0);
			l.setMsg(e.getMessage());
		}
		return l;
	}
	
	
	@PostMapping("/login")
	public Layui login(@RequestBody User user) throws InterruptedException {
		Thread.sleep(3000);
		User queryUser= helloService.login(user);
		System.out.println("-------------"+queryUser);
		Layui l=new Layui();
		if(queryUser==null) {
			l.setCode(1);
			l.setMsg("登录失败");
		}
		return l;
	}
		
}
