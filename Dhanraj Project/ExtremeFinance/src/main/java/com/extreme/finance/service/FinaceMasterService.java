package com.extreme.finance.service;

import java.util.List;

import com.extreme.finance.model.FinanceMaster;

public interface FinaceMasterService {

	FinanceMaster addFinnaceData(FinanceMaster financeMaster);

	List<FinanceMaster> getAllFinanceData();

}
