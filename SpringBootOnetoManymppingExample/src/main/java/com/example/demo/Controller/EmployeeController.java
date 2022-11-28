package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	
	@Autowired
	private EmployeeService es;
	
	@PostMapping(value = "/addEmpDepart")
	public String provideDepartment(@RequestBody Employee employee) {
		System.out.println("Department Check : " + employee);
		es.addEmpDeprt(employee);
		return "Department Allocated to employee...!";
	}
}
