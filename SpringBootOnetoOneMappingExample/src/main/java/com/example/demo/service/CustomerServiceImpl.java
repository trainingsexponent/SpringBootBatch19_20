package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository cr;
	
	@Override
	public List<Customer> getAllcustomer() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public Customer getSinglecustomer(int id) {
		// TODO Auto-generated method stub
		return cr.findById(id).get();
	}

}
