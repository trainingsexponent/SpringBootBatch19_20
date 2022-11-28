package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Login;
import com.example.demo.repo.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService{

   @Autowired
   private LoginRepository lr;
	
	@Override
	public void addLogiinDataWithCustommer(Login login) {
		// TODO Auto-generated method stub
		System.out.println("Login Data With Customer In Service : " + login);
		lr.save(login);
	}

	@Override
	public ResponseDto getLoginData(String un, String ps) {
		// TODO Auto-generated method stub
		ResponseDto responseDto = new ResponseDto();
		Login login = lr.findByUnameAndPass(un, ps);
		if(login != null) {
			responseDto.setName(login.getCustomer().getName());
			responseDto.setUname(login.getUname());
			responseDto.setEmailId(login.getCustomer().getEmailId());
		}
		return responseDto;
	}

}
