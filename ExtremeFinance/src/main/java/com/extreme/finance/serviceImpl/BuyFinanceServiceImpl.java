package com.extreme.finance.serviceImpl;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.model.Buy;
import com.extreme.finance.model.EmployeeData;
import com.extreme.finance.repo.EmployeeDataRepository;
import com.extreme.finance.service.BuyService;

@Service
public class BuyFinanceServiceImpl implements BuyService{

	@Autowired
	private EmployeeDataRepository employeeDataRepository;
	@Override
	public void addFinanceData(EmployeeData employeeData) {
		System.out.println("In To Buy Service Layer:"+employeeData);
		LocalDateTime date = LocalDateTime.now();
	    List<Buy> blist=employeeData.getLbuy();
	    for (Buy buy : blist) {
	    	buy.setBuydate(date);
			
		}
	    System.out.println(blist);
		employeeDataRepository.save(employeeData);
	}
	@Override
	public List<EmployeeData> getAllData() {
		List<EmployeeData> elist= employeeDataRepository.findAll();
		return elist;
	}
	@Override
	public EmployeeData deleteEmployeeDataUsingId(int id) {
		EmployeeData employeeData= employeeDataRepository.findById(id).get();
		 employeeDataRepository.deleteById(id);
		 return employeeData;
	}
	@Override
	public List<EmployeeData> getUpdatedData(EmployeeData employeeData) {
	 employeeDataRepository.save(employeeData);
		return (List<EmployeeData>)employeeDataRepository.findAll();
	}

}
