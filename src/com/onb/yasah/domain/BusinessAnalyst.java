package com.onb.yasah.domain;

import javax.persistence.Entity;

@Entity
public class BusinessAnalyst extends Employee{

	
	public BusinessAnalyst(Employee employee) {
		super(employee);
	}
	
	public BusinessAnalyst(){
		
	}
	
	
	
}
