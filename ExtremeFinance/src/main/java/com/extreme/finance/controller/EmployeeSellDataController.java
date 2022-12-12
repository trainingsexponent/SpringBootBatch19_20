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
import com.extreme.finance.model.EmployeeSellData;
import com.extreme.finance.service.SellService;

@RestController
public class EmployeeSellDataController {
	@Autowired
	private SellService sellService;
	
	@PostMapping(value =ApiEndpoint.SELLFINANCE )
	public String sellFinance(@RequestBody EmployeeSellData employeeSellData) {
		System.out.println("In To Employee Controller:"+employeeSellData);
		sellService.addFinanceSellData(employeeSellData);
		return "User Sell Finance";
		
	}
	@PutMapping(value = ApiEndpoint.SELLFINANCEUPDATE)
	public List<EmployeeSellData> getUpdateEmployeeMasterData(@RequestBody EmployeeSellData employeeSellData) {
		return sellService.getUpdatedSellData(employeeSellData);

	}
	@DeleteMapping(value = ApiEndpoint.SELLFINANCEDELET)
	public EmployeeSellData deletEmployeeDataUsingId(@PathVariable("id") int id) {
		return sellService.deleteEmployeeSellDataUsingId(id);
		
	}
	@GetMapping(value =ApiEndpoint.SELLFINANCEALLDATA)
	public List<EmployeeSellData> getAllEmmloyeeData() {
		return sellService.getAllSellData();
	}

}
