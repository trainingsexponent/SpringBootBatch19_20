package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository er;
	
	@Override
	public Employee addEmployeeInfo(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("In Service Layer : " + employee);
		Employee e=er.save(employee);
		return e;
	}

	@Override
	public EmployeeDto getLoginCheckData(String uname, String pass) {
		// TODO Auto-generated method stub
		EmployeeDto employeeDto = new EmployeeDto();
		Employee employee = er.findByUnameAndPass(uname, pass);
		if(employee!=null) {
			employeeDto.setId(employee.getId());
			employeeDto.setName(employee.getName());
			employeeDto.setUname(employee.getUname());
			return employeeDto;
		}
		else {
			employeeDto.setErrorMsg("Employee not Found");
			return employeeDto;
		}
		
	}

	@Override
	public List<Employee> getAllData() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public Employee getEmployeeUsingId(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> optional = er.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return optional.get();
	}

}
