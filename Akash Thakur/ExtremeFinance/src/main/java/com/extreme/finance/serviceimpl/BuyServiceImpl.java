package com.extreme.finance.serviceimpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.model.Buy;
import com.extreme.finance.model.EmployeeData;
import com.extreme.finance.repo.EmployeeDataRepo;
import com.extreme.finance.service.BuyService;

@Service
public class BuyServiceImpl implements BuyService{
	
	@Autowired
	private EmployeeDataRepo br;

	@Override
	public void addbuyData(EmployeeData data) {
		// TODO Auto-generated method stub
		System.out.println("Buy Finance In Service Layer "+data);
		LocalDateTime dateTime = LocalDateTime.now();
		List<Buy> blist =data.getLbuy();
		for (Buy buy : blist) {
			buy.setBuyDate(dateTime);
		}
		
		System.out.println(blist);
		br.save(data);
	}

}
