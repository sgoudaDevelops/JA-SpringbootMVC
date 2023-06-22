package com.softtek.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.model.Customer;

@RestController
public class CustomerOperationController {
 @GetMapping("/report")
 public ResponseEntity<Customer> showData(){
	 Customer cust= new Customer(1001,"raja","banglore",146367.5f);
	 HttpStatus st= HttpStatus.OK;
	 return new ResponseEntity<Customer>(cust,st);
 }
 }
