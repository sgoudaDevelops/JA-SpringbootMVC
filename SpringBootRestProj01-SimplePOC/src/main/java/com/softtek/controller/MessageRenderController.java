package com.softtek.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //(@controller+ (@responseBody on all the handler methods)
@RequestMapping("/message") //Global Path (purely Optional)
public class MessageRenderController {

	@GetMapping("/generate")
	public ResponseEntity<String> generateMessage()
	{
		//get system date and time
		LocalDateTime dateTime = LocalDateTime.now();
		
		//get the current hour of the day
		int hour = dateTime.getHour();
		
		String body=null;
		
		if(hour<12)
			body="Good Morning";
		
		else if(hour<16)
			body="Good Afternoon";
		
		else if(hour<20)
			body="Good Evening";
		
		else
			body="Good Night";
		
		//response status
		HttpStatus status = HttpStatus.OK;
		
		//create ResponseEntity object
		ResponseEntity<String> entity = new ResponseEntity<>(body, status);
		
		return entity;
	}
}
