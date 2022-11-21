package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService ss;
	
	//@RequestMapping(value = "/reg",method = RequestMethod.POST)
	@PostMapping(value = "/reg")
	public String toRegisterStudentData(@RequestBody Student student) {
		System.out.println("Register Data : " + student);
		ss.addStudentData(student);
		return "successfully Register...!";
	}
	
	@GetMapping(value = "/allData")
	public List<Student> getAllData(){
	return ss.getAllData();
	}
	
	@GetMapping(value = "/get/{id}")
	public Student getSingleStudent(@PathVariable("id") int id) {
		return ss.getSingleStudent(id);
	}
	
	@PutMapping(value = "/up")
	public List<Student> getUpdatedData(@RequestBody Student student) {
		return ss.getIUpdatedData(student);
	}
}
