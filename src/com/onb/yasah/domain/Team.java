package com.onb.yasah.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Team extends AbstractModel{

	@OneToOne(fetch = FetchType.EAGER)
	private ProjectManager teamLead;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "TEAM_EMPLOYEE", 
			joinColumns = { @JoinColumn(name = "TEAM_ID") }, 
			inverseJoinColumns = { @JoinColumn(name = "EMPLOYEE_ID") })
	private Set<Employee> listOfMembers = new HashSet<Employee>();

	public Employee getTeamLead() {
		return teamLead;
	}

	public void setTeamLead(ProjectManager teamLead) {
		this.teamLead = teamLead;
	}

	public Set<Employee> getListOfMembers() {
		return listOfMembers;
	}

	public void setListOfMembers(Set<Employee> listOfMembers) {
		this.listOfMembers = listOfMembers;
	}
	
	
}
