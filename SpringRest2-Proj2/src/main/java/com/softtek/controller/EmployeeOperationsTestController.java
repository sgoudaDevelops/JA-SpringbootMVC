package com.softtek.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeOperationsTestController {
	
	@GetMapping("/report")
	public ResponseEntity<String> getAllEmployeee() {
		System.out.println("EmployeeOperationTestController.getAllEmployeee()");
		return new ResponseEntity<String>("Get-All Employee are listed ", HttpStatus.OK);
	}

	@PostMapping("/register")
	public ResponseEntity<String> registerEmployeee() {
		System.out.println("EmployeeOperationTestController.registerEmployeee()");
		return new ResponseEntity<String>("POST - Employee registration ", HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateEmployeee() {
		System.out.println("EmployeeOperationTestController.updateEmployeee()");
		return new ResponseEntity<String>("PUT - Employee is updated ", HttpStatus.OK);
	}

	@PatchMapping("/emailUpdate")
	public ResponseEntity<String> updateEmployeeeEmail() {
		System.out.println("EmployeeOperationTestController.updateEmployeeeEmail()");
		return new ResponseEntity<String>("PATCH - Employee email is updated ", HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteEmployeee() {
		System.out.println("EmployeeOperationTestController.updateEmployeee()");
		return new ResponseEntity<String>("DELETE - Employee is deleted ", HttpStatus.OK);
	}
}
