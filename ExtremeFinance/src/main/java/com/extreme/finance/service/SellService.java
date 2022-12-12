package com.extreme.finance.service;

import java.util.List;

import com.extreme.finance.model.EmployeeSellData;

public interface SellService {
	
	void addFinanceSellData(EmployeeSellData employeeSellData);

	List<EmployeeSellData> getAllSellData();

	EmployeeSellData deleteEmployeeSellDataUsingId(int id);

	List<EmployeeSellData> getUpdatedSellData(EmployeeSellData employeeSellData);
	
	

}
