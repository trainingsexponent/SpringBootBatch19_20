package com.extreme.finance.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.model.Role;
import com.extreme.finance.repo.RoleRepository;
import com.extreme.finance.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleRepository rs;

	@Override
	public void addRole(Role role) {
		// TODO Auto-generated method stub
		
		System.out.println("Role In Service Layer "+role);
		
		rs.save(role);
		
	}

	@Override
	public List<Role> getallrole() {
		
		return rs.findAll();
	}

	@Override
	public List<Role> deleteRole(int rid) {
		 Role role= rs.findById(rid).get();
		 rs.delete(role);
		return rs.findAll();
	}

}
