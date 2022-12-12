package com.extreme.finance.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

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
@Entity
public class EmployeeSellData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int edid;

	private int emid;

	private String empname;

	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "e_s_id")
	private List<Sell> lsell = new ArrayList<Sell>();


}
