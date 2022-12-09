package com.extreme.finance.service;

import java.util.List;

import com.extreme.finance.dto.EmployeeMasterDto;
import com.extreme.finance.model.Login;

public interface LoginService {
	
	void addloginwithemployee(Login login);
	
	List<Login> deletelogerwithempl(int id);
	
	EmployeeMasterDto getLoginData(String uname,String pass);

}
