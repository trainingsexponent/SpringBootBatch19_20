package com.example.demo.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
		try {
			System.out.println("File Data Storing........");
			File file = new File("D:\\pojo.jpg");

			student.setFname(file.getName());
			student.setFtype(file.getAbsolutePath());

			Path path = Paths.get(file.getAbsolutePath());

			byte[] b = Files.readAllBytes(path);
			student.setFdata(b);
    
			System.out.println("Check : " + student);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		studentDao.addStudent(student);
	}

}
