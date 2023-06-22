package com.softtek.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.model.Customer;

import lombok.Data;

@RestController
public class CustomerOperationController {
	// 
	//@PostMapping(value={"/register","/print"})
	@PostMapping("/register")
	public Customer printData(@RequestBody Customer cust)
	{
		System.out.println("CustomerOperationController.printData()");
		return cust;
	}
	
}
