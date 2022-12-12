package com.extreme.finance.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeMasterDto {
	@JsonInclude(value = Include.NON_DEFAULT)
	private int empId;
	@JsonInclude(value = Include.NON_EMPTY)
	private String uname;
	@JsonInclude(value = Include.NON_EMPTY)
	private String name;
	@JsonInclude(value = Include.NON_EMPTY)
	private String erroeMsg;
	@JsonInclude(value = Include.NON_EMPTY)
	private String rolename;

}
