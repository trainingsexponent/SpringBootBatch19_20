package com.extreme.finance.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.model.FinanceMaster;
import com.extreme.finance.repo.FinanceMasterRepository;
import com.extreme.finance.service.FinanceMasterService;

@Service
public class FinanceMasterImpl implements FinanceMasterService{

	@Autowired
	private FinanceMasterRepository financeMasterRepository;
	@Override
	public FinanceMaster addFinanceData(FinanceMaster financeMaster) {
	System.out.println("In To FinanceMaster Service Layer...: "+financeMaster);
		LocalDateTime date = LocalDateTime.now();
		financeMaster.setFdate(date);
		FinanceMaster fmaster= financeMasterRepository.save(financeMaster);
		return fmaster;
	}
	@Override
	public List<FinanceMaster> getAllFinanceMasterData() {
		
		return financeMasterRepository.findAll();
	}
	@Override
	public List<FinanceMaster> getUpdatedData(FinanceMaster financeMaster) {
		 financeMasterRepository.save(financeMaster);
		return( List<FinanceMaster>)financeMasterRepository.findAll();
	}
	@Override
	public FinanceMaster deleteFinanceMasterUsingId(int id) {
		FinanceMaster financeMaster= financeMasterRepository.findById(id).get();
		financeMasterRepository.deleteById(id);
		return financeMaster;
	}

}
