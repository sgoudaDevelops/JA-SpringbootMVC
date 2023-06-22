package com.softtek.controller;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import com.softtekservice.ILinksService;
import com.softtekservice.LinksServiceImpl;

public class LinkHandler {
	private ILinksService service;

	public LinkHandler() {
		service = new LinksServiceImpl();
	}

	// handler method 1   
	public String showWishMessage(HttpServletRequest req) {
		String resulMsg = service.generateWishMessage();
		// keep the result in request scope      
		req.setAttribute("wmsg", resulMsg);
		// return logical view name(LVN) based on which jsp file name and location will
		// be decided   
		return "wish_result";
	}

	// handler method 2   
	public String showALlMessage(HttpServletRequest req) { // use service   
		Set<String> langSet = service.fetchAllLanguages();
		//langSet.forEach(System.out::println);
		// keep the result in request scope       
		req.setAttribute("langinfo", langSet);
		// return logical view name(LVN)       
		return "all_lang";
	}
}
