package com.extreme.finance.service;

import java.util.List;

import com.extreme.finance.model.FinanceMaster;

public interface FinanceService {

	FinanceMaster addFinnaceData(FinanceMaster financeMaster);
	
	List<FinanceMaster> getAllFinanceData();
}
