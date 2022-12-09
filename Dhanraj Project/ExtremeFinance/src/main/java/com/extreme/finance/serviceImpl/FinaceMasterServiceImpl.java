package com.extreme.finance.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.model.FinanceMaster;
import com.extreme.finance.repo.FinanceRepository;
import com.extreme.finance.service.FinaceMasterService;

@Service
public class FinaceMasterServiceImpl implements FinaceMasterService {

	@Autowired
	private FinanceRepository financeRepository;

	@Override
	public FinanceMaster addFinnaceData(FinanceMaster financeMaster) {
		System.out.println("In Finance ServiceMaster" + financeMaster);
		LocalDateTime date = LocalDateTime.now();
		financeMaster.setFdate(date);
		FinanceMaster fmaster = financeRepository.save(financeMaster);
		return fmaster;
	}

	@Override
	public List<FinanceMaster> getAllFinanceData() {
		// TODO Auto-generated method stub
		return financeRepository.findAll();
	}

}
