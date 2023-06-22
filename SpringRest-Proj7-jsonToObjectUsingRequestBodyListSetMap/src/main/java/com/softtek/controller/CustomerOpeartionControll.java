package com.softtek.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.model.Customer;

@RestController
public class CustomerOpeartionControll {
 @PostMapping("/register")
 public Customer saveCustomer(@RequestBody Customer cust)
 {
	 System.out.println("CustomerOpeartionControll.saveCustomer()");
	// return new ResponseEntity<String>(cust.toString(),HttpStatus.OK);
	 return cust;
	 
 }
}
