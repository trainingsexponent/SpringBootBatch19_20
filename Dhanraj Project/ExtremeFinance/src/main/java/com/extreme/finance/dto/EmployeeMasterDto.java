package com.extreme.finance.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeMasterDto {

	private int empid;
	@JsonInclude(value = Include.NON_EMPTY)
	private String uname;
	@JsonInclude(value = Include.NON_EMPTY)
	private String name;
	@JsonInclude(value = Include.NON_EMPTY)
	private String errorMsg;
	@JsonInclude(value = Include.NON_EMPTY)
	private String rolename;

}
