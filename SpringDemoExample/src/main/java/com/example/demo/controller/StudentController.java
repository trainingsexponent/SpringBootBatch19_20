package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	

	@RequestMapping(value = "/")
	public String getIndexPage() {
		System.out.println("Index age Calling");
		return "index";
	}
	
	@RequestMapping(value = "/reg")
	public String getRegissterData(@ModelAttribute Student student) {
		System.out.println("Student Register Data : " + student);
		studentService.addStudent(student);
		return "index";
	}
	
}
