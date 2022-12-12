package com.extreme.finance.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.extreme.finance.dto.EmployeeMasterDto;
import com.extreme.finance.model.Login;
import com.extreme.finance.repo.LoginRepository;
import com.extreme.finance.service.CURDService;
import com.extreme.finance.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService,CURDService {
	@Autowired
	private LoginRepository loginRepository;
    private JavaMailSender javaMailSender;
	@Override
	public void addLoginDataWithEmployee(Login login) {
		System.out.println("Login Service : "+login);
		LocalDateTime dateOfJoin=LocalDateTime.now();
		login.getEmployeeMaster().setDateofjoin(dateOfJoin);
		loginRepository.save(login);
		
	}

	@Override
	public EmployeeMasterDto getLoginData(String uname, String pass) {
		System.out.println("In Service:"+uname+" "+pass);
		EmployeeMasterDto employeeMasterDto= new EmployeeMasterDto();
		Login login=loginRepository.findByUnameAndPass(uname, pass);
		
		if(login != null) {
			employeeMasterDto.setEmpId(login.getEmployeeMaster().getEmpmasterid());
			employeeMasterDto.setName(login.getEmployeeMaster().getEmpname());
			employeeMasterDto.setUname(login.getUname());
			employeeMasterDto.setRolename(login.getEmployeeMaster().getRole().getRolename());
		}else {
			employeeMasterDto.setErroeMsg("Invalid Uname And Pass.......!");
		}
		System.out.println(employeeMasterDto);
		return employeeMasterDto;
	}

	@Override
	public Login deleteEmployeeMasterUsingId(int id) {
		Login login =loginRepository.findById(id).get();
		
		loginRepository.deleteById(id);
		return login;
	}

	
	@Override
	public List<Login> getUpdatedData(Login login) {
	loginRepository.save(login);
		return(List<Login>) loginRepository.findAll();
	}

	@Override
	public List<Login> getAllData() {
		System.out.println("All Data Fetching ..... :");
		List<Login>slist = loginRepository.findAll();
		return slist;
	}

	

	

	
	

}
