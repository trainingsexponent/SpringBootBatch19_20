package com.extreme.finance.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.extreme.finance.model.Buy;
import com.extreme.finance.service.BuyDataService;
import com.extreme.finance.util.ExcelGenertor;

public class BuyDataController {
	@Autowired
	private BuyDataService buyDataService;
	
	@GetMapping(value = "download/buy.xlsx")
	public ResponseEntity<InputStreamResource> excelBuyDataReport() throws IOException{
		List<Buy> blist = buyDataService.getBuyData();
		
		ByteArrayInputStream in = ExcelGenertor.excelGenerating(blist);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment;filename=Buy.xlsx");
	
		return ResponseEntity
				.ok()
				.headers(headers)
				.body(new InputStreamResource(in));
	}
}
