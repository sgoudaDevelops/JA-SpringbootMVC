package com.softtek.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.model.Company;
import com.softtek.model.Customer;

@RestController
public class CustomerOperationController {
	//@GetMapping("/view")
	// public ResponseEntity<Customer>showData()//
	// {Customer cust = new Customer(1001, "Muskan", "Bangalore", 18264527.0f);
		// HttpStatus status = HttpStatus.OK;
		// return new ResponseEntity<Customer>(cust,status);// }
	   //}
	@GetMapping("report1")
	public ResponseEntity<Customer>showData()
	{
		Customer cust= new Customer(1001,"shiva","banglore",45678.56f,new String[] {"red","black","green"},
				List.of("10th","10+2","bTECH"),Set.of(2345678l,345678l,987654l),
				Map.of("adhar",12345876l,"pan",345678765l),new Company("Softtek", "Bangalore", "IT", 750)
				);
		HttpStatus status= HttpStatus.OK;
		 return new ResponseEntity<Customer>(cust,status);
		
	}
}
