package com.extreme.finance.serviceImpl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.dto.EmployeeMasterDto;
import com.extreme.finance.model.Login;
import com.extreme.finance.repo.LoginRepository;
import com.extreme.finance.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public void addloginDateWithEmployee(Login login) {

		System.out.println("login Service:" + login);
		LocalDateTime ldt = LocalDateTime.now();
		login.getEmployeeMaster().setDateofjoin(ldt);
		loginRepository.save(login);

	}

	@Override
	public EmployeeMasterDto getLoginDate(String uname, String pass) {

		System.out.println("In service Layer" + uname + "" + pass);
		EmployeeMasterDto employeeMasterDto = new EmployeeMasterDto();
		Login login = loginRepository.findByUnameAndPass(uname, pass);
		if (login != null) {
			employeeMasterDto.setEmpid(login.getEmployeeMaster().getEmpmasterid());
			employeeMasterDto.setName(login.getEmployeeMaster().getEmpname());
			employeeMasterDto.setUname(login.getUname());
			employeeMasterDto.setRolename(login.getEmployeeMaster().getRole().getRolename());

		} else {
			employeeMasterDto.setErrorMsg("Invalid Credenatial....");
			System.out.println(employeeMasterDto);
		}
		return employeeMasterDto;

	}

}
