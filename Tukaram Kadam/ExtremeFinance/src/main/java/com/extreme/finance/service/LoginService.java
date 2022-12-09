package com.extreme.finance.service;

import com.extreme.finance.dto.EmployeeMasterDTO;
import com.extreme.finance.model.Login;

public interface LoginService {

	void addLoginDatawithEmployee(Login login);

EmployeeMasterDTO getLoginData(String uname,String pass);
}
