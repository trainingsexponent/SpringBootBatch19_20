package com.example.demo.dto;

public class ResponseDto {

	private String uname;
	
	private String name;
	
	private String emailId;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "ResponseDto [uname=" + uname + ", name=" + name + ", emailId=" + emailId + "]";
	}
	
	
}
