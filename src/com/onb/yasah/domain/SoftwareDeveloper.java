package com.onb.yasah.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;

@Entity
public class SoftwareDeveloper extends Employee{
	
	public SoftwareDeveloper(Employee employee) {
		super(employee);
	}

	public SoftwareDeveloper(){
		
	}
	
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="Language")
	private Set<String> languages = new HashSet<String>();

	public Set<String> getLanguages() {
		return languages;
	}

	public void setLanguages(Set<String> languages) {
		this.languages = languages;
	}
		
}
