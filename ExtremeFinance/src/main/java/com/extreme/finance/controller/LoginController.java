package com.extreme.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.finance.api.ApiEndpoint;
import com.extreme.finance.dto.EmployeeMasterDto;
import com.extreme.finance.model.Login;
import com.extreme.finance.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	private JavaMailSender javaMailSender;

	@PostMapping(value = ApiEndpoint.ADDEMPLOYEE)
	public String addLoginAndEmployeeData(@RequestBody Login login) {
		System.out.println("In Controller :" + login);
		loginService.addLoginDataWithEmployee(login);
		return "Employee Added....!";

	}


	@PostMapping(value =ApiEndpoint.LOGIN )
	public ResponseEntity<EmployeeMasterDto> getLoginData(@RequestBody Login login){
		System.out.println("In Login Controller:"+login);
		EmployeeMasterDto employeeMasterDto = loginService.getLoginData(login.getUname(), login.getPass());
		return ResponseEntity.ok(employeeMasterDto);
		
	}

}
