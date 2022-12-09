package com.extreme.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.finance.api.ApiEndPoint;
import com.extreme.finance.model.FinanceMaster;
import com.extreme.finance.service.FinanceService;

@RestController
public class FinanaceController {
	
	@Autowired
	private FinanceService fs;
	
	@PostMapping(value = ApiEndPoint.ADDFINANCE)
	public ResponseEntity<String> getfinancedata(@RequestBody FinanceMaster financeMaster){
		
		FinanceMaster financeMaster2 = fs.addFinanceMasterData(financeMaster);
		if(financeMaster2.getFid()>0) {
			return ResponseEntity.ok("Finance Data Added Successfully");
		}
		
		
		return ResponseEntity.ok("Finance Data Not Add Successfully");
		
		
		
	}
	
	@GetMapping(value = ApiEndPoint.GETFINANCE)
	public ResponseEntity<List<FinanceMaster>> getallFinanceMasterData(){
		List<FinanceMaster> flist = fs.getAllFinanceMaster();
		
		return ResponseEntity.ok(flist);
	}

}
