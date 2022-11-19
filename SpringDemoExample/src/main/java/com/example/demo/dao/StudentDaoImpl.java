package com.example.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired 
	private SessionFactory sf;

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("In Dao Layer : " + student);
		Session session = sf.openSession();
		session.save(student);
		session.beginTransaction().commit();
	}
}
