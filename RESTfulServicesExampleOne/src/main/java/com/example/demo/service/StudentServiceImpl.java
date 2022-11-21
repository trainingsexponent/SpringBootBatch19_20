package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository sr;
	
	@Override
	public void addStudentData(Student student) {
		// TODO Auto-generated method stub
		System.out.println("In Service Layer : "+ student);
		sr.save(student);

	}

	@Override
	public List<Student> getAllData() {
		// TODO Auto-generated method stub
		System.out.println("All Data Fetching......");
		List<Student> slist =(List<Student>) sr.findAll();
		return slist;
	}

	@Override
	public Student getSingleStudent(int id) {
		// TODO Auto-generated method stub
		Student student = sr.findById(id).get();
		return student;
	}

	@Override
	public List<Student> getIUpdatedData(Student student) {
		// TODO Auto-generated method stub
		sr.save(student);
		return (List<Student>) sr.findAll();
	}

	
}
