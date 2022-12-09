package com.extreme.finance.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.finance.api.ApiEndPoint;
import com.extreme.finance.dto.EmployeeMasterDto;
import com.extreme.finance.model.Login;
import com.extreme.finance.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService ls;
	
	
	@PostMapping(value =ApiEndPoint.ADDEMPLOYEE)
	public String addloginwithemployee(@RequestBody Login login) {
		ls.addloginwithemployee(login);
		 
		return "Successfully Added";
	}
	
	@DeleteMapping(value = ApiEndPoint.DELETEEMPL)
	public List<Login> deleteLogerwithemployee(@PathVariable ("id") int id){
		
		return ls.deletelogerwithempl(id);
	}
	
	@PostMapping(value =ApiEndPoint.LOGIN)
	public ResponseEntity<EmployeeMasterDto> getLoginData(@RequestBody Login login){
		
		System.out.println("In Login Controller "+login);
		
		EmployeeMasterDto dto= ls.getLoginData(login.getUname(), login.getPass());
		
		return ResponseEntity.ok(dto);
		
		
		
	}

}
