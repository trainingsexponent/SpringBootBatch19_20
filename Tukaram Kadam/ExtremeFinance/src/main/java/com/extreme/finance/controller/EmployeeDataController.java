package com.extreme.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.finance.Api.ApiEndpoints;
import com.extreme.finance.model.EmployeeData;
import com.extreme.finance.service.BuyService;

@RestController
public class EmployeeDataController {

	@Autowired
	private BuyService buyservice;

	@PostMapping(value = ApiEndpoints.BUYFINANCE)
	public String buyFinance(@RequestBody EmployeeData employeeData) {

		buyservice.addBuyfinanceData(employeeData);
		return "User buy finance";

	}
}