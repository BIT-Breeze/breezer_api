package com.breezer.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.breezer.api.dto.JSONResult;
import com.breezer.api.service.TestService;
import com.breezer.api.vo.TestVo;

@Controller("TestAPIController")
@RequestMapping("/api/test")
public class TestApiController {

	
	@Autowired
	private TestService testService;
	
	@ResponseBody
	@RequestMapping("/request")
	public JSONResult test() {
		System.out.println("recieve request - api/test/request");
		return JSONResult.success("r u hyungeun?");
	}
	
	
	@ResponseBody
	@RequestMapping("/insert")
	public JSONResult insert() {
		System.out.println("recieve inset - api/test/inset");
		
		TestVo vo = new TestVo();
		vo.setName("helloTest");
		vo.setAge(10);
		
		if ( testService.insertMessage(vo) ) {
			return JSONResult.success("data inserted");
		} else {
			return JSONResult.fail("fail");
		}
	}
	
	
	
}
