package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Comapny;
import com.example.demo.service.CompanyService;

@RestController
public class ComapanyController {

	@Autowired
	private CompanyService cs;
	
	@PostMapping(value = "/reg")
	public String addComapnyAndEmplyee(@RequestBody Comapny comapny) {
		System.out.println("In Controller   : " + comapny);
		cs.addData(comapny);
		return "SuccessFully Added...!";
	}
}
