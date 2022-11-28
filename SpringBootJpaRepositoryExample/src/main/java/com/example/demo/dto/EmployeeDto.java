package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class EmployeeDto {
	
	@JsonInclude(value =Include.NON_EMPTY)
	private int id;
	
	@JsonInclude(value =Include.NON_EMPTY)
	private String name;
	
	@JsonInclude(value =Include.NON_EMPTY)
	private String uname;
	
	@JsonInclude(value =Include.NON_EMPTY)
	private String errorMsg;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", name=" + name + ", uname=" + uname + ", errorMsg=" + errorMsg + "]";
	}
	
	

}
