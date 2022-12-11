package com.extreme.finance.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.extreme.finance.model.EmployeeData;

public interface BuyRepositry extends JpaRepository<EmployeeData, Integer> {

}
