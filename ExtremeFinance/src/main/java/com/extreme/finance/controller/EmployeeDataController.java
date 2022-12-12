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
import com.extreme.finance.model.EmployeeData;
import com.extreme.finance.service.BuyService;

@RestController
public class EmployeeDataController {
	@Autowired
	private BuyService buyService;
	
	@PostMapping(value =ApiEndpoint.BUYFINANCE )
	public String buyFinance(@RequestBody EmployeeData employeeData) {
		System.out.println("In To Employee Controller:"+employeeData);
		buyService.addFinanceData(employeeData);
		return "User Buy Finance";
		
	}
	@PutMapping(value = ApiEndpoint.BUYFINANCEUPDATE)
	public List<EmployeeData> getUpdateEmployeeMasterData(@RequestBody EmployeeData employeeData) {
		return buyService.getUpdatedData(employeeData);

	}
	@DeleteMapping(value = ApiEndpoint.BUYFINANCEDELET)
	public EmployeeData deletEmployeeDataUsingId(@PathVariable("id") int id) {
		return buyService.deleteEmployeeDataUsingId(id);
		
	}
	@GetMapping(value =ApiEndpoint.BUYFINANCEALLDATA)
	public List<EmployeeData> getAllEmmloyeeData() {
		return buyService.getAllData();
	}

}
