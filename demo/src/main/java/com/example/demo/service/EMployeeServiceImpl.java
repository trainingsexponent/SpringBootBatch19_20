package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.exception.EmployeeNotFound;
import com.example.demo.model.Employee;

@Service
public class EMployeeServiceImpl implements  EmployeeService{

	@Override
	public Employee getEmployeeUsingName(String name) throws EmployeeNotFound{
		// TODO Auto-generated method stub
		List<Employee> elist = new ArrayList<Employee>();
		
		Employee e = new Employee();
		e.setId(12);e.setName("Ajas");e.setAddress("Pune");
		Employee e1 = new Employee();
		e1.setId(14);e1.setName("Shaikh");e1.setAddress("Pune");
		Employee e2 = new Employee();
		e2.setId(13);e2.setName("Nilesh");e2.setAddress("Pune");
		
		elist.add(e);elist.add(e1);elist.add(e2);
		
		Employee emp = null;
		for(Employee  em : elist ) {
			if(em.getName().equals(name)) {
				emp = em;
				break;
			}
		}
		System.out.println(emp);
		if(emp !=null) {
			System.out.println(" Check : " + name);
			return emp;
		}
		else {
			throw new EmployeeNotFound("Employee Not Exist");
		}
	}

}
