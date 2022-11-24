package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Comapny;
import com.example.demo.repo.ComapnyRepository;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private ComapnyRepository cr;
	
	@Override
	public void addData(Comapny comapny) {
		// TODO Auto-generated method stub
		System.out.println("Check DataIn service : " + comapny);
		cr.save(comapny);
	}

}
