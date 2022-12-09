package com.extreme.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.api.ApiEndpoints;
import com.extreme.finance.model.Role;
import com.extreme.finance.service.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@PostMapping(value=ApiEndpoints.ADDROLE)
	public String addRoleData(@RequestBody Role role) {
		System.out.println("Role Data:"+role);
		roleService.addRole(role);
		return "Successfully Added...!";
		
		
	}
	@GetMapping(value=ApiEndpoints.ALLROLE)
	public List<Role> getAllRoleData(){
		return roleService.getAllRole();
		
	}

}
