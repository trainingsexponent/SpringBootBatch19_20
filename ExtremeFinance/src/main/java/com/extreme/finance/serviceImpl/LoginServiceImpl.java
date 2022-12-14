package com.extreme.finance.serviceImpl;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.dto.EmployeeMasterDto;
import com.extreme.finance.model.Login;
import com.extreme.finance.repo.LoginRepository;
import com.extreme.finance.service.LoginService;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class LoginServiceImpl implements LoginService{

	private static final Logger LOGGER = Logger.getLogger(LoginServiceImpl.class);

	private Map<String, String> map = null;
	
	@PostConstruct
	private void readDataFromJsonFile() throws StreamReadException, DatabindException, IOException {
		System.out.println("Check Method is Called....!");
		ObjectMapper objectMapper = new ObjectMapper();
		File file = new File("src/main/resources/spring.json");
		map = objectMapper.readValue(file, Map.class);
	    System.out.println("Map  Value : " + map);
	}
	

	
	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public void addLoginDataWithEmployee(Login login) {
		// TODO Auto-generated method stub
		LOGGER.debug("Login Service : " + login);
		LocalDateTime dateOfJoin = LocalDateTime.now();
		login.getEmployeeMaster().setDateofjoin(dateOfJoin);
		loginRepository.save(login);
		LOGGER.info("Login Data Saved Sucessfully");
	}

	@Override
	public EmployeeMasterDto getLoginData(String uname, String pass) {
		// TODO Auto-generated method stub
		System.out.println("In Service layer : " + uname + "  " + pass);
		EmployeeMasterDto employeeMasterDto = new EmployeeMasterDto();
		Login login = loginRepository.findByUnameAndPass(uname, pass);
		if(login != null) {
			employeeMasterDto.setEmpid(login.getEmployeeMaster().getEmpmasterid());
			employeeMasterDto.setName(login.getEmployeeMaster().getEmpname());
			employeeMasterDto.setUname(login.getUname());
			employeeMasterDto.setRolename(login.getEmployeeMaster().getRole().getRolename());
		}
		else {
			employeeMasterDto.setErrorMsg("Invalid Credentials.....!");
		}
		System.out.println(employeeMasterDto);
		return employeeMasterDto;
	}

}
