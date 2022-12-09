package com.extreme.finance.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.model.Buy;
import com.extreme.finance.model.EmployeeData;
import com.extreme.finance.repo.BuyRepository;
import com.extreme.finance.service.BuyService;

@Service
public class BuyServiceImpl implements BuyService {

	@Autowired
	private BuyRepository buyrepo;
	@Override
	public void addBuyfinanceData(EmployeeData employeeData) {
		// TODO Auto-generated method stub
		System.out.println("in service layer"+employeeData);
		LocalDateTime date = LocalDateTime.now();
	List<Buy>blist=	employeeData.getLbuy();
	for(Buy b : blist) {
		b.setBuydate(date);
	}
	System.out.println(blist);
	buyrepo.save(employeeData);
	}

}
