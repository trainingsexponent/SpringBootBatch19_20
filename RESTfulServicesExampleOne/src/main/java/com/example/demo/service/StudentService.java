package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

	void addStudentData(Student student);
	
	List<Student> getAllData();
	
	Student getSingleStudent(int id);
	
	List<Student> getIUpdatedData(Student student);
}
