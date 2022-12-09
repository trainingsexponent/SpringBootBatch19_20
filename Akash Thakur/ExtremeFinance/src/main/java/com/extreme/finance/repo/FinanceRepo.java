package com.extreme.finance.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.extreme.finance.model.FinanceMaster;

@Repository
public interface FinanceRepo  extends JpaRepository<FinanceMaster, Integer>{

}
