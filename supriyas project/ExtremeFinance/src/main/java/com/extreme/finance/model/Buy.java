package com.extreme.finance.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Buy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	
	private String fbuyname;
	
	private LocalDateTime buydate;
	
	private double buyrate;
	
	private Integer buyquantity;
	
	private double amount;

}
