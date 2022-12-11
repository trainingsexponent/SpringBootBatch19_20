package com.extreme.finance.service;

import com.extreme.finance.dto.EmployeeMasterDto;
import com.extreme.finance.model.Login;

public interface LoginService {

	void addloginDateWithEmployee(Login login);

	EmployeeMasterDto getLoginDate(String uname, String pass);

}
