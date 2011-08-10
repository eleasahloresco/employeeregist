package com.onb.yasah.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class ProjectManager extends Employee{

	public ProjectManager(Employee employee) {
		super(employee);
	}
	
	public ProjectManager(){
		
	}

}
