package com.extreme.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.finance.api.ApiEndpoint;
import com.extreme.finance.model.FinanceMaster;
import com.extreme.finance.service.FinanceMasterService;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@RestController
public class FinanceMasterController {
	@Autowired
	private FinanceMasterService financeMasterService;
	
	@PostMapping(value =ApiEndpoint.FINANCEDATA )
	public ResponseEntity<String> addFinanceMasterData(@JsonInclude(value = Include.NON_NULL)@RequestBody FinanceMaster financeMaster){
		System.out.println("In To The FinanceMaster Controller:"+financeMaster);
		FinanceMaster fmaster= financeMasterService.addFinanceData(financeMaster);
		if (fmaster.getFid()>0) {
			
			return ResponseEntity.ok("Finance Data Added Successfully....!");
			
		}
		return ResponseEntity.ok("Finance Data Not Added Successfully....!");
		
	}
	
	@GetMapping(value =ApiEndpoint.FINANCEALLDATA )
	
	public ResponseEntity<List<FinanceMaster>> getAllFinaceData(){
		List<FinanceMaster> flist = financeMasterService.getAllFinanceMasterData();
		return ResponseEntity.ok(flist);
		
	}
	@PutMapping(value = ApiEndpoint.UPDATEFINANCE)
	public List<FinanceMaster> getUpdateEmployeeMasterData(@RequestBody FinanceMaster financeMaster) {
		return financeMasterService.getUpdatedData(financeMaster);

	}
	@DeleteMapping(value = ApiEndpoint.DELETEFINANCE)
	public FinanceMaster deletEmployeeMasterUsingId(@PathVariable("id") int id) {
		return financeMasterService.deleteFinanceMasterUsingId(id);
		
	}

}
