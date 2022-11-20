package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class HomeController {

	@RequestMapping(value = "/check")
	public String getData1() {
		
		return "Checking Done...!";
	}
	
	@RequestMapping(value = "/getStu")
	public Student getSingleStudent() {
		Student student = new Student();
		student.setId(1234);student.setName("Abc");
		student.setAddress("Pune");
		System.out.println(student);
		return student;
	}
	
	@RequestMapping(value = "/getList")
	public List<Student> getData(){
		List<Student> slist = new ArrayList<Student>();
		Student student = new Student();
		student.setId(1234);student.setName("Abc");
		student.setAddress("Pune");
		Student student2 = new Student();
		student2.setId(12);student2.setName("Pqrs");
		student2.setAddress("Pune");
		slist.add(student2);
		slist.add(student);
		return slist;
	}
}
