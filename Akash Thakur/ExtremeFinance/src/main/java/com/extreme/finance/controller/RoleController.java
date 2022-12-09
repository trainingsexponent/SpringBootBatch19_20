package com.extreme.finance.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.finance.api.ApiEndPoint;
import com.extreme.finance.model.Role;
import com.extreme.finance.service.RoleService;

import lombok.Getter;

@RestController
public class RoleController {
	
	@Autowired
	private RoleService rs;
	
	@PostMapping(value=ApiEndPoint.ADDROLE)
	public String addRoleData(@RequestBody Role role) {
		System.out.println("Role Data "+role);
		rs.addRole(role);
		return "Successfully Register Role ";
	}
	
	@GetMapping(value = ApiEndPoint.GETALLROLE)
	public List<Role> getAllRole(){
		
		return rs.getallrole();
	}
	
	@DeleteMapping(value =ApiEndPoint.DELETEROLE )
	public List<Role> deleteRole(@PathVariable("id") int rid){
		
		return rs.deleteRole(rid);
	}

}
