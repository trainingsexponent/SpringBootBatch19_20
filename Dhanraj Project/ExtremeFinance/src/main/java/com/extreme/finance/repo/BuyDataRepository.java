package com.extreme.finance.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.extreme.finance.model.Buy;

public interface BuyDataRepository extends JpaRepository<Buy, Integer> {

}
