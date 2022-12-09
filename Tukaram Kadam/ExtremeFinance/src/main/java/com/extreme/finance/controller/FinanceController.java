package com.extreme.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.finance.Api.ApiEndpoints;
import com.extreme.finance.model.FinanceMaster;
import com.extreme.finance.service.FinanceService;

@RestController
public class FinanceController {

	@Autowired
	private FinanceService financeservice;
	
	@PostMapping(value = ApiEndpoints.ADDFINANANCEDATA)
	public ResponseEntity<String>getFinancedata(@RequestBody FinanceMaster financeMaster){
		
		System.out.println("in the Controller layer");
		FinanceMaster fmaster =financeservice.addFinanceData(financeMaster);
		if(fmaster.getFid()>0) {
			return ResponseEntity.ok("finance data add Successfull...");
			
		}
	return ResponseEntity.ok("finance data not add successfully");
	}
	
	@GetMapping(value=ApiEndpoints.ALLFINACEDATA)
	public ResponseEntity<List<FinanceMaster>>getAllFinanceDate(){
		List<FinanceMaster>flist=financeservice.gerAllFinanceDAte();
		
		return ResponseEntity.ok().body(flist);
	}
}
