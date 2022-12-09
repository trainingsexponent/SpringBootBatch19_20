package com.extreme.finance.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.model.FinanceMaster;
import com.extreme.finance.service.FinanceService;

@Service
public class FinanceServiceImpl implements FinanceService {

	@Autowired
	FinanceRepository financerepo;
	@Override
	public FinanceMaster addFinanceData(FinanceMaster financeMaster) {
		// TODO Auto-generated method stub
		System.out.println("in service FinanceMaster");
		 LocalDateTime date =  LocalDateTime.now();
		 financeMaster.setFdate(date);
	FinanceMaster fmaster=	 financerepo.save(financeMaster);
		return fmaster;
	}
	@Override
	public List<FinanceMaster> gerAllFinanceDAte() {
		// TODO Auto-generated method stub
		
		return financerepo.findAll();
	}

}
