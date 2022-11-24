package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService ds;
	
	@PostMapping(value = "/departAdd")
	public String addDepartmentData(@RequestBody Department department) {
		System.out.println("Check  Dept. Data: " + department);
		ds.addDepartData(department);
		return "Department Added...!";
	}
	
	@GetMapping(value = "/allDepart")
	public List<Department> getAllDeprt(){
		return ds.getAllDepartment();
	}
	
}
