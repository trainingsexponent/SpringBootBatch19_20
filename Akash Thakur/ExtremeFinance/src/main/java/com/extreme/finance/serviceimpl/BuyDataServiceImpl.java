package com.extreme.finance.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.model.Buy;
import com.extreme.finance.repo.BuyDataRepo;
import com.extreme.finance.service.BuyDataService;

@Service
public class BuyDataServiceImpl implements BuyDataService{
	
	
	@Autowired
	private BuyDataRepo br;

	@Override
	public List<Buy> getBuyData() {
		// TODO Auto-generated method stub
		
		return br.findAll();
	}

}
