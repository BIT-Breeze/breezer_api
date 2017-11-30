package com.breezer.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.breezer.api.dto.JSONResult;
import com.breezer.api.service.PostService;

@Controller
@RequestMapping("/post")
public class PostController {

	@Autowired
	private PostService postService;
	
	
	@ResponseBody
	@RequestMapping("upload")
	public JSONResult upload() {
		postService.uploadMessage();
		return JSONResult.success("post upload success");
	}
}
