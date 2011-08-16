package com.onb.yasah.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.onb.yasah.domain.BusinessAnalyst;
import com.onb.yasah.domain.Employee;
import com.onb.yasah.domain.ProjectManager;
import com.onb.yasah.domain.SoftwareDeveloper;
import com.onb.yasah.service.EmployeeService;


@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
	public void initBinder(WebDataBinder binder){
		
	}

	@RequestMapping(value = "")
	public String home() {
		return "index";
	}

	@RequestMapping(value = "/viewEmployee")
	public String showListOfEmployee(Model model){
		model.addAttribute("employees", employeeService.listOfEmployees());
		return "viewEmployee"; 
	}

	@RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
	public String showAddEmployee(@ModelAttribute("employeeModel") Employee employee){
		return "addEmployee";
	}

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute("employeeModel") Employee employee, BindingResult bindingResult, 
			HttpServletRequest request){

		if(employee.getFirstName() == null || employee.getFirstName().isEmpty()){
			bindingResult.rejectValue("firstName", "firstName.validation.error", null, "is empty");
		}

		if(employee.getMiddleName() == null || employee.getMiddleName().isEmpty()){
			bindingResult.rejectValue("middleName", "middleName.validation.error", null, "is empty");
		}

		if(employee.getLastName() == null || employee.getLastName().isEmpty()){
			bindingResult.rejectValue("lastName", "lastName.validation.error", null, "is empty");
		}
		
		if(employee.getEmail() == null || employee.getEmail().isEmpty()){
			bindingResult.rejectValue("email", "email.validation.error", null, "is empty");
		}
		
		if (bindingResult.hasErrors()){
			return "addEmployee";
		}

		switch(Integer.parseInt(request.getParameter("type"))){
			case 1: SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper(employee);
					employeeService.save(softwareDeveloper);
					break;
			case 2: BusinessAnalyst businessAnalyst = new BusinessAnalyst(employee);
					employeeService.save(businessAnalyst);
					break;
			case 3: ProjectManager projectManager = new ProjectManager(employee);
					employeeService.save(projectManager);
					break;
			default: employeeService.save(employee);
		}

		return "redirect:viewEmployee";
	}

	@RequestMapping(value = "/searchByType")
	public String searchByTypeForm(){
		return "searchByType";
	}
	
	@RequestMapping(value = "/searchByTypeResults", method = RequestMethod.GET)
	public String showSearchByTypeResults(){
		return "searchByTypeResults";
	}
	
	@RequestMapping(value = "/searchByTypeResults", method = RequestMethod.POST)
	public String searchByTypeResults(Model model, HttpServletRequest request){
		model.addAttribute("employees", employeeService.findEmployeeByType(request.getParameter("type")));
		return "searchByTypeResults";
	}
	
	@RequestMapping(value = "/searchMenu")
	public String showSearchMenu(){
		return "searchMenu";
	}
	
	@RequestMapping(value = "/searchWithField", method = RequestMethod.GET)
	public String showSearchWithField(@ModelAttribute("employeeModel") Employee employee){
		return "searchWithField";	
	}
	
	@RequestMapping(value = "/searchWithField", method = RequestMethod.POST)
	public String searchWithFieldResult(@ModelAttribute("employeeModel") Employee employee, BindingResult bindingResult, 
			HttpServletRequest request){
		
		switch(Integer.parseInt(request.getParameter("type"))){
			case 1: request.setAttribute("employees", employeeService.findAnyMatch(employee));
					break;
			case 2: request.setAttribute("employees", employeeService.findExactMatches(employee));
					break;
		}
		
		return "searchWithFieldResults";	
	}
	
	
}
