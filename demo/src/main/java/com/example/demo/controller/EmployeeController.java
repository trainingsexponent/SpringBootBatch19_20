package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.EmployeeNotFound;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService es;
	
	@GetMapping(value = "/get")
	public ResponseEntity<Employee> getEmployee(@RequestParam String name) throws EmployeeNotFound{
		System.out.println("Employee Name : " + name);
		try {
		Employee em = es.getEmployeeUsingName(name);	
		return ResponseEntity.ok(em);
		}catch (EmployeeNotFound e) {
			// TODO: handle exception
			throw new EmployeeNotFound("Not Found Employee");
		}

	}
}
