package com.extreme.finance.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.extreme.finance.model.Buy;
import com.extreme.finance.model.EmployeeData;

@Repository
public interface EmployeeDataRepo extends JpaRepository<EmployeeData, Integer>{

}
