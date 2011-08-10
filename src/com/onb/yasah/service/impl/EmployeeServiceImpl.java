package com.onb.yasah.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.onb.yasah.dao.EmployeeDAO;
import com.onb.yasah.domain.Employee;
import com.onb.yasah.service.EmployeeService;

@Service("employeeService")
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Transactional(readOnly = false)
	public void save(Employee employee) {
		employeeDAO.save(employee);
	}

	@Transactional(readOnly = false)
	public void update(Employee employee) {
		employeeDAO.update(employee);		
	}

	@Transactional(readOnly = false)
	public void delete(Employee employee) {
		employeeDAO.delete(employee);		
	}

	public List<Employee> listOfEmployees() {
		return employeeDAO.listOfEmployees();
	}

	public Employee find(Long id) {
		return employeeDAO.find(id);
	}

	public List<Employee> findExactMatches(Employee employee) {
		return employeeDAO.findExactMatches(employee);
	}

	public List<Employee> findAnyMatch(Employee employee) {
		return employeeDAO.findAnyMatch(employee);
	}

	public List<Employee> findEmployeeByType(String type) {
		return employeeDAO.findEmployeeByType(type);
	}
	
	@Transactional(rollbackFor = (IOException.class), readOnly = false, propagation = Propagation.REQUIRED)
	public void transferBalance(){
		
	}
}
