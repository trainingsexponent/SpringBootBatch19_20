package com.extreme.finance.serviceImpl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.model.Login;
import com.extreme.finance.repo.LoginRepository;
import com.extreme.finance.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public void addLoginDataWithEmployee(Login login) {
		// TODO Auto-generated method stub
		System.out.println("Login Service : " + login);
		LocalDateTime dateOfJoin = LocalDateTime.now();
		login.getEmployeeMaster().setDateofjoin(dateOfJoin);
		loginRepository.save(login);
	}

}
