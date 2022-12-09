package com.extreme.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.finance.Api.ApiEndpoints;
import com.extreme.finance.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService es;
	
	@DeleteMapping(value =ApiEndpoints.DELETE)
	public String DeleteEmployee(@PathVariable int id) {
		
		es.deleteEmployee(id);
		
		return "Deleted Successfully";
	}
	
}
