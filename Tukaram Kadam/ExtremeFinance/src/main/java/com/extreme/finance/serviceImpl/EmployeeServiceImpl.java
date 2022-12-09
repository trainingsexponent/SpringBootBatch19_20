package com.extreme.finance.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.model.EmployeeMaster;
import com.extreme.finance.repo.EmployeeMasterRepository;
import com.extreme.finance.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeMasterRepository er;

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		EmployeeMaster em = new EmployeeMaster();

		if (id != 0) {

			er.deleteById(id);
			System.out.println("Deleted Successfully");
		}
	}


}
