package com.onb.yasah.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class BusinessAnalyst extends Employee{

	
	public BusinessAnalyst(Employee employee) {
		super(employee);
	}
	
	public BusinessAnalyst(){
		
	}
	
	
	
}
