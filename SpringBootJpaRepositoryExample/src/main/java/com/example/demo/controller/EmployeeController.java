package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeeService;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService es;
	
	@PostMapping(value = "/reg")
	public String addEmployeeData(@RequestBody Employee employee) {
		System.out.println("Check Data In Controller : "+ employee);
		Employee e = es.addEmployeeInfo(employee);
		if(e.getId()>0) {
			return "Successfully Register...!";
		}
		return "Not Register...!";
	}
	
	@PostMapping(value = "/log")
	public EmployeeDto getLoginCheck(@RequestBody Employee employee) {
		System.out.println("Employee login Data : " + employee);
		EmployeeDto employee2 = es.getLoginCheckData(employee.getUname(), employee.getPass());
		return employee2;
	}
	
	@GetMapping(value = "/log1")
	public EmployeeDto getLoginCheck1(@RequestParam String uname,@RequestParam String pass) {
		System.out.println("Employee login Data : " + uname +  "  "  + pass);
		EmployeeDto employee2 = es.getLoginCheckData(uname, pass);
		return employee2;
	}
	
	@GetMapping(value = "/allData")
	public List<Employee> getAllData() {
		return es.getAllData();
	}
	
	@GetMapping(value = "/get/{id}")
	public Employee getSingleData(@PathVariable int id) {
		return es.getEmployeeUsingId(id);
	}
}
