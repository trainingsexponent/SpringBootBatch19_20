package com.extreme.finance.serviceimpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.dto.EmployeeMasterDto;
import com.extreme.finance.model.Login;
import com.extreme.finance.repo.LoginRepository;
import com.extreme.finance.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginRepository lr;

	@Override
	public void addloginwithemployee(Login login) {
		
		System.out.println("Login Service Layer "+login);
		LocalDateTime dateTime = LocalDateTime.now();
		login.getEmployeeMaster().setDateofjoin(dateTime);
		lr.save(login);
		
	}

	@Override
	public List<Login> deletelogerwithempl(int id) {
		// TODO Auto-generated method stub
		 Login login= lr.findById(id).get();
		 lr.delete(login);
		return lr.findAll();
	}

	@Override
	public EmployeeMasterDto getLoginData(String uname, String pass) {
		// TODO Auto-generated method stub
		
		System.out.println("Check In Service Layer "+uname +" "+pass);
		
		EmployeeMasterDto dto = new EmployeeMasterDto();
		
		Login login =lr.findByUnameAndPass(uname, pass);
		if(login !=null) {
			dto.setId(login.getEmployeeMaster().getEmpmasterid());
			dto.setName(login.getEmployeeMaster().getEmpname());
			dto.setUname(login.getUname());
			dto.setRoleName(login.getEmployeeMaster().getRole().getRoleName());
		}else {
			dto.setErrorMsg("Invalid Credentials");
		}
		System.out.println(dto);
		return dto;
	}

}
