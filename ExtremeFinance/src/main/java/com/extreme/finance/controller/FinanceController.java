package com.extreme.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.finance.api.ApiEndpoints;
import com.extreme.finance.model.FinanceMaster;
import com.extreme.finance.service.FinanceService;

@RestController
public class FinanceController {

	@Autowired
	private FinanceService financeService;
	
	@PostMapping(value = ApiEndpoints.FINANCEDATA)
	public ResponseEntity<String> addFinanceData(@RequestBody FinanceMaster financeMaster){
		System.out.println("Finance Data In Controller---->" + financeMaster);
		FinanceMaster fMaster = financeService.addFinnaceData(financeMaster);
		if(fMaster.getFid()>0) {
			return ResponseEntity.ok("Finance Data Added Successfully...!").status(HttpStatus.CREATED).build();
		}
		return ResponseEntity.ok("Finance Data not Added Successfully...!");
	}
	
	@GetMapping(value = ApiEndpoints.FINANCEALLDATA )
	public ResponseEntity<List<FinanceMaster>> getAllFinaceData(){
		
		List<FinanceMaster> flist = financeService.getAllFinanceData();
		
		return ResponseEntity.ok().body(flist);
	}
}
