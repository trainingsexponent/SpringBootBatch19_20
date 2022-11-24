package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	
	private String dname;
	
	private String dcode;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDcode() {
		return dcode;
	}

	public void setDcode(String dcode) {
		this.dcode = dcode;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", dcode=" + dcode + "]";
	}
	
	
}
