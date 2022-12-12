package com.extreme.finance.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.extreme.finance.model.EmployeeSellData;

@Repository
public interface EmployeeSellDataRepository extends JpaRepository<EmployeeSellData, Integer> {

	

}
