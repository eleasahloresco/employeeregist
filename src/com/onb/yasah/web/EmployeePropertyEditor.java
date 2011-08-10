package com.onb.yasah.web;

import java.beans.PropertyEditorSupport;

import com.onb.yasah.service.EmployeeService;

public class EmployeePropertyEditor extends PropertyEditorSupport{

	private final EmployeeService employeeService;
	
	public EmployeePropertyEditor(EmployeeService employeeService){
		super();
		this.employeeService = employeeService;
	}
	
//	@Override
//	public String getAsText(){
//		Object value = getValue();
//		if(value == null) return null;
//		
//		Long id =
//	}
//	
		
}
