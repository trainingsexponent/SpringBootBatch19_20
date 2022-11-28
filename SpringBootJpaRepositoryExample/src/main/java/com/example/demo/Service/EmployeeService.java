package com.example.demo.Service;

import java.util.List;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.Employee;

public interface EmployeeService {

	Employee addEmployeeInfo(Employee employee);
	
	EmployeeDto getLoginCheckData(String uname,String pass);
	
	List<Employee> getAllData();
	
	Employee getEmployeeUsingId(int id);
	
}
