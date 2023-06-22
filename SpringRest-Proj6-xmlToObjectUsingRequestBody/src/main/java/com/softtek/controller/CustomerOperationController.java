package com.softtek.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.model.Customer;

@RestController
public class CustomerOperationController {

//	@PostMapping("/printDataFromXml")
//	public ResponseEntity<Customer> printdata(@RequestBody Customer cust) {
//		System.out.println("CustomerOperationController.printdata()");
//		return new ResponseEntity<Customer>(cust,HttpStatus.OK);
//	}
	
	// since we are using restController we can send the data without using lvn & @responseEntity
	@PostMapping("/printDataFromXml")
	public  Customer printdata (@RequestBody Customer cust) {
		System.out.println("CustomerOperationController.printdata()");
		//return new ResponseEntity<Customer>(cust,HttpStatus.OK);
		return cust;
	}
	
	
}
