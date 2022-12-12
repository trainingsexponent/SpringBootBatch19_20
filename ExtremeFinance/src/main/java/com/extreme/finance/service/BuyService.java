package com.extreme.finance.service;

import java.util.List;

import com.extreme.finance.model.EmployeeData;

public interface BuyService {
	void addFinanceData(EmployeeData employeeData);

	List<EmployeeData> getAllData();

	EmployeeData deleteEmployeeDataUsingId(int id);

	List<EmployeeData> getUpdatedData(EmployeeData employeeData);
	
	

}
