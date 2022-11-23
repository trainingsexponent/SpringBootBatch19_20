package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Login;
import com.example.demo.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService ls;
	
	@PostMapping(value = "/reg")
	public String registerCutomerWithLoginData(@RequestBody Login login)
	{
		System.out.println("In Controller All Data : " + login);
		ls.addLogiinDataWithCustommer(login);
		return "Register Data Successfully";
	}
	
	@GetMapping(value = "/log")
	public ResponseDto getLoginData(@RequestParam String uname,@RequestParam String pass) {
		System.out.println("Login Data : " + uname + " " + pass );
		ResponseDto responseDto = ls.getLoginData(uname, pass);
		return responseDto;
	}
}
