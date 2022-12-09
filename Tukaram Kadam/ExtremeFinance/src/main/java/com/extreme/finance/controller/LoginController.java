package com.extreme.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.finance.Api.ApiEndpoints;
import com.extreme.finance.dto.EmployeeMasterDTO;
import com.extreme.finance.model.Login;
import com.extreme.finance.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService ls;
	
	@PostMapping(value=ApiEndpoints.ADDLOGIN)
public String addLoginData(@RequestBody Login login) {
	ls.addLoginDatawithEmployee(login);
	return "login Successfully";
}
	@PostMapping(value=ApiEndpoints.LOGIN)
	public ResponseEntity<EmployeeMasterDTO> getLoginData(@RequestBody Login login){
		System.out.println("in login layer"+login);
	EmployeeMasterDTO employeeMasterDTO =	ls.getLoginData(login.getUname(),login.getPass());
		return ResponseEntity.ok(employeeMasterDTO);
	}
}