package com.extreme.finance.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.model.Buy;
import com.extreme.finance.model.EmployeeData;
import com.extreme.finance.repo.BuyRepositry;
import com.extreme.finance.service.BuyService;

@Service
public class BuyServiceImpl implements BuyService {
	@Autowired
	private BuyRepositry buyRepositry;

	@Override
	public void addBuyFinanceData(EmployeeData employeeData) {
		System.out.println("Buy Finance In Service" + employeeData);
		LocalDateTime date = LocalDateTime.now();
		List<Buy> blist = employeeData.getLbuy();
		for (Buy b : blist) {
			b.setBuyDate(date);
		}

		System.out.println(blist);
		buyRepositry.save(employeeData);
	}

}
