package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Employee;
import com.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@RequestMapping(value="/")
	public ModelAndView create(){
		return new ModelAndView("index");
		
	}
	@RequestMapping(value="/AddEmployee")
	public ModelAndView loadEmployee(@ModelAttribute("employee") Employee employee){
		return new ModelAndView("AddEmployee");
		
	}
	@RequestMapping(value="/ViewEmployee")
	public ModelAndView ViewEmployee(@ModelAttribute("employee") Employee employee){
		System.out.println("view");
		List<Employee> list=employeeService.getAll();
		return new ModelAndView("ViewEmployee","listOfEmployees",list);
		
	}
	@RequestMapping(value="/deleteEmployee")
	public ModelAndView deleteEmployee(HttpServletRequest request){
		System.out.println("hi");
	int id=Integer.parseInt(request.getParameter("id"));
	employeeService.deleteById(id);
	return new ModelAndView("redirect:/ViewEmployee");
		
		
	}
	@RequestMapping("/editEmployee")
	 public ModelAndView editEmployee(HttpServletRequest request,@ModelAttribute("employee") Employee employee){

	  //int id = Integer.parseInt(request.getParameter("id"));
	  return new ModelAndView("EditEmployee");

	 }
	@RequestMapping(value="/save")
	public ModelAndView saveEmployee(@ModelAttribute("employee") Employee employee){
		employeeService.saveData(employee);
		return new ModelAndView("redirect:/ViewEmployee");
		
	}
}
