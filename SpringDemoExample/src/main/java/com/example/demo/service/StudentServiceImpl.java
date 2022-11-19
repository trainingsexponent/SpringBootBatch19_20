package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("In service Layer: " + student);
		//File Handling Code Write Here
		studentDao.addStudent(student);
	}

}
