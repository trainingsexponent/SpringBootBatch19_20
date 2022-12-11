package com.extreme.finance.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.extreme.finance.model.Buy;
import com.extreme.finance.repo.BuyDataRepository;
import com.extreme.finance.service.BuyDataService;

public class BuyDataServiceImpl implements BuyDataService{

	@Autowired
	private BuyDataRepository buyDataRepository;
	
	@Override
	public List<Buy> getBuyData() {
		// TODO Auto-generated method stub
		return buyDataRepository.findAll();
	}
}