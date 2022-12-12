package com.extreme.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.finance.api.ApiEndpoint;
import com.extreme.finance.model.Login;
import com.extreme.finance.service.CURDService;
import com.extreme.finance.service.LoginService;

@RestController
public class AdminController {
	@Autowired
	private CURDService curdService;
	private LoginService loginService;
	@PostMapping(value = ApiEndpoint.ADDEMPLOYEEBYADMIN)
	public String addLoginAndEmployeeData(@RequestBody Login login) {
		System.out.println("In Controller :" + login);
		curdService.addLoginDataWithEmployee(login);
		return "Employee Added....!";

	}

	@PutMapping(value = ApiEndpoint.UPDATE)
	public List<Login> getUpdateEmployeeMasterData(@RequestBody Login login) {
		return curdService.getUpdatedData(login);

	}
	@DeleteMapping(value = ApiEndpoint.DELETE)
	public Login deletEmployeeMasterUsingId(@PathVariable("id") int id) {
		return curdService.deleteEmployeeMasterUsingId(id);
		
	}
	@GetMapping(value =ApiEndpoint.ALLDATA)
	public List<Login> getAllEmmloyeeMaster() {
		return curdService.getAllData();
	}

}
