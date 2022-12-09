package com.extreme.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.finance.api.ApiEndPoint;
import com.extreme.finance.model.Buy;
import com.extreme.finance.model.EmployeeData;
import com.extreme.finance.service.BuyService;

@RestController
public class EmployeeDataController {
	
	@Autowired
	private BuyService bs;
	
	@PostMapping(value=ApiEndPoint.ADDBUY)
	public String addBuyData(@RequestBody EmployeeData data) {
		bs.addbuyData(data);
		return "Buy Finance Addded";
	}

}
