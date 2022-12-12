package com.extreme.finance.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.model.EmployeeSellData;
import com.extreme.finance.model.Sell;
import com.extreme.finance.repo.EmployeeSellDataRepository;
import com.extreme.finance.service.SellService;
@Service
public class SellFinanceServiceImpl implements SellService {

	@Autowired
	private EmployeeSellDataRepository employeeSellDataRepository;
	
	@Override
	public void addFinanceSellData(EmployeeSellData employeeSellData) {
		System.out.println("In To Buy Service Layer:"+employeeSellData);
		LocalDateTime date = LocalDateTime.now();
	    List<Sell> llist=employeeSellData.getLsell();
	    for (Sell sell : llist) {
	    	sell.setSelldate(date);
			
		}
	    System.out.println(llist);
	employeeSellDataRepository.save(employeeSellData);
		
	}

	@Override
	public List<EmployeeSellData> getAllSellData() {
		List<EmployeeSellData> llist= employeeSellDataRepository.findAll();
		return llist;
	}

	@Override
	public EmployeeSellData deleteEmployeeSellDataUsingId(int id) {
		EmployeeSellData employeeSellData= employeeSellDataRepository.findById(id).get();
		 employeeSellDataRepository.deleteById(id);
		 return employeeSellData;
	}

	@Override
	public List<EmployeeSellData> getUpdatedSellData(EmployeeSellData employeeSellData) {
		 employeeSellDataRepository.save(employeeSellData);
			return (List<EmployeeSellData>)employeeSellDataRepository.findAll();
	}

	
}
