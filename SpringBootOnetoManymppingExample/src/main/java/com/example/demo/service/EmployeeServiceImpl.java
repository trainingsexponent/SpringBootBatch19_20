package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository er ;
	@Override
	public void addEmpDeprt(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Check Employe  depart :" + employee);
		er.save(employee);
	}

}
