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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Loss {
	@Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lid;
	
	private double percentageLoss;
	
	private LocalDateTime lossdate;
	
	
}
