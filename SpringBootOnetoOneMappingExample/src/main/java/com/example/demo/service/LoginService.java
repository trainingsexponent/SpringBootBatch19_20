package com.example.demo.service;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Login;

public interface LoginService {

	void addLogiinDataWithCustommer(Login login);
	
	ResponseDto getLoginData(String un,String ps);
}
