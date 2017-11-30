package com.breezer.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.breezer.api.dto.JSONResult;
import com.breezer.api.service.TourService;

@Controller
@RequestMapping("/tour")
public class TourController {
	
	@Autowired
	private TourService tourService;
	
	
	@ResponseBody
	@RequestMapping("/insert")
	public JSONResult insert() {
		
		tourService.insertMessage();
		return JSONResult.success("category insert success");
	}

}
