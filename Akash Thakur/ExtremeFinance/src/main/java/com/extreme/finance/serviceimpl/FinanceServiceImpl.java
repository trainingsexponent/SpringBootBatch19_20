package com.extreme.finance.serviceimpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.model.FinanceMaster;
import com.extreme.finance.repo.FinanceRepo;
import com.extreme.finance.service.FinanceService;
@Service
public class FinanceServiceImpl implements FinanceService {
	
	@Autowired
	private FinanceRepo fr;

	@Override
	public FinanceMaster addFinanceMasterData(FinanceMaster financeMaster) {
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		financeMaster.setFdate(dateTime);
		
		return fr.save(financeMaster);
	}

	@Override
	public List<FinanceMaster> getAllFinanceMaster() {
		// TODO Auto-generated method stub
		
		
		return fr.findAll();
	}

}
