package com.extreme.finance.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.api.ApiEndpoints;
import com.extreme.finance.dto.EmployeeMasterDto;
import com.extreme.finance.model.Login;
import com.extreme.finance.service.LoginService;

@RestController
public class LoginController {
	private static final Logger LOGGER = Logger.getLogger(LoginController.class);

	@Autowired
	private LoginService loginService;

	@PostMapping(value = ApiEndpoints.ADDEMPLOYEE)
	public String addLoginAndEmployeeData(@RequestBody Login login) {
		LOGGER.debug("In Controller : " + login);
		loginService.addloginDateWithEmployee(login);
		LOGGER.info("Operation Completed...!");
		return "Employee Added....!";
	}

	@PostMapping(value = ApiEndpoints.LOGIN)
	public ResponseEntity<EmployeeMasterDto> getLoginData(@RequestBody Login login) {

		LOGGER.debug("in Login controller" + login);
		EmployeeMasterDto employeeMasterDto = loginService.getLoginDate(login.getUname(), login.getPass());

		return ResponseEntity.ok(employeeMasterDto);
		
		
	}
}