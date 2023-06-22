package com.softtek.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.softtek.service.ISeasonfinderService;

@Controller
public class SeasonOperationController {
	@Autowired
	private ISeasonfinderService service;
	@RequestMapping("/")
	public String showHome()
	{
		return "welcome";
	}
	@RequestMapping("/display")
	public String showSeason(Map<String,Object> map)
	{
		// use service
		String msg=service.findSeason();
		//keep the results in model attribute
		map.put("resultmessage", msg);
		// return lvn
		return "display";
		
	}

}
