package com.extreme.finance.service;

import java.util.List;

import com.extreme.finance.model.Login;

public interface CURDService {

	Login deleteEmployeeMasterUsingId(int id);

	List<Login> getAllData();

	List<Login> getUpdatedData(Login login);

	void addLoginDataWithEmployee(Login login);
	
	

	
}
