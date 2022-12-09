package com.extreme.finance.serviceImpl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.dto.EmployeeMasterDTO;
import com.extreme.finance.model.Login;
import com.extreme.finance.repo.LoginRepository;
import com.extreme.finance.service.LoginService;


@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginRepository lr;

	@Override
	public void addLoginDatawithEmployee(Login login) {
		// TODO Auto-generated method stub
		System.out.println("login impl"+login);
		LocalDateTime localdate=LocalDateTime.now();
		login.getEmployeeMaster().setDateofjoin(localdate);
		
		lr.save(login);
		
	}

	@Override
	public EmployeeMasterDTO getLoginData(String uname, String pass) {
		// TODO Auto-generated method stub
		System.out.println("In Service layer"+uname+" " +pass);
		EmployeeMasterDTO employeeMasterDTO = new EmployeeMasterDTO();
		Login login = lr.findByUnameAndPass(uname, pass);
		System.out.println("login here"+login);
		if(login !=null) {
			
			employeeMasterDTO.setId(login.getEmployeeMaster().getEmpmasterid());
			employeeMasterDTO.setName(login.getEmployeeMaster().getEmpname());
		employeeMasterDTO.setUname(login.getPass());
		employeeMasterDTO.setRolename(login.getEmployeeMaster().getRole().getRolename());
		}else {
			employeeMasterDTO.setErrorMsg("invalid Credentials");
		}
		System.out.println(login);
		
		return employeeMasterDTO;
	}

}
