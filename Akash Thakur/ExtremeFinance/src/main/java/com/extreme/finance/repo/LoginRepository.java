package com.extreme.finance.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.extreme.finance.model.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>{
	
	Login findByUnameAndPass(String uname,String pass);

}
