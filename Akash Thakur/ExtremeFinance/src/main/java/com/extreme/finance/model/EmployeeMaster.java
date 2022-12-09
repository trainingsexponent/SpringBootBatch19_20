package com.extreme.finance.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empmasterid;
	
	private String empname;
	
	private String address;
	
	private String contactno;
	
	private String emailid;
	
	private String gender;
	
	private LocalDateTime dateofjoin;
	
	private String createdby;
	
	private LocalDateTime modifieddate;
	
	private Integer active;
	
	private Integer deleted;
	
	@OneToOne(cascade = CascadeType.DETACH)
	private Role  role;
	
//	{
//
//		"uname":"admin",
//		"pass":"admin",
//		"employeeMaster":{
//		    "empname":"Shree",
//		    "address":"Latur",
//		    "contactno":"7219897967",
//		    "emailid":"at100789@gmail.com",
//		    "gender":"Male",
//		    "createdby":"Akash",
//		    "active":"1",
//		    "deleted":"0",
//		    "role":{
//		        "rid":"1",
//		        "rname":"admin"
//		    }
//		   
//		}
//
//		}
	
	
	
	
	
	

}
