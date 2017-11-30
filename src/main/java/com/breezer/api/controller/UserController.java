package com.breezer.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.breezer.api.dto.JSONResult;
import com.breezer.api.service.UserService;

@Controller("UserController")
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@ResponseBody
	@RequestMapping("/join")
	public JSONResult join() {
		userService.joinMessage();
		return JSONResult.success("insertSuccess");
	}
	
	
	
	@ResponseBody
	@RequestMapping("/login")
	public JSONResult login() {
		return null;
	}
	
	
	
	
	@ResponseBody
	@RequestMapping("/update")
	public JSONResult update() {
		return null;
	}
	
	
	
	@ResponseBody
	@RequestMapping("/delete")
	public JSONResult delete() {
		return null;
	}
	
}
