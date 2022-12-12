package com.extreme.finance.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.extreme.finance.model.EmployeeData;

@Repository
public interface EmployeeDataRepository extends JpaRepository<EmployeeData, Integer> {

}
