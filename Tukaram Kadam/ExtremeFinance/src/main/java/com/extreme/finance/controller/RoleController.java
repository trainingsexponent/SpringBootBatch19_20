package com.extreme.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.finance.Api.ApiEndpoints;
import com.extreme.finance.model.Role;
import com.extreme.finance.service.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	private RoleService roleservice;

	@PostMapping(value= ApiEndpoints.ADDROLE)
	public String addRoleDate(@RequestBody Role role) {
		roleservice.addRole(role);
		System.out.println("Role date "+role);
		return "Role Successfully added";
	}
	@GetMapping(value = ApiEndpoints.ALLROLE)
	public List<Role>getAllRolesName(){
		
		return roleservice.getAllRole();
	}

	
}
