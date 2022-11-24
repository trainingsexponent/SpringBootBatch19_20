package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Department;

public interface DepartmentService {

	void addDepartData(Department department);
	
	List<Department> getAllDepartment();
}
