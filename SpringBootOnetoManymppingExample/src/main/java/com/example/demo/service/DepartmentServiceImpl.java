package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.demo.repo.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository dr;
	
	@Override
	public void addDepartData(Department department) {
		// TODO Auto-generated method stub
		System.out.println("Depat. In Service Layer :"+ department);
		dr.save(department);
	}

	@Override
	public List<Department> getAllDepartment() {
		// TODO Auto-generated method stub
		return dr.findAll();
	}

}
