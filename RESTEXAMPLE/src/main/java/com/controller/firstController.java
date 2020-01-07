package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appexception.InvalidEmployeeDetail;
import com.model.Employee;
import com.service.EmployeeService;

@RestController
@Transactional
public class firstController {
	@Autowired
	private EmployeeService employeeService;

	private static final Logger logger = LoggerFactory.getLogger(firstController.class);

	@GetMapping(value = "/one")
	public String functionName() {
		return "Welcome to ReST web service";
	}

	@GetMapping(value = "/read")
	public Employee getemployee() {
		Employee employee = new Employee();
		employee.setEmpNo(123);
		employee.setEmpName("Tea break");
		return employee;
	}

	@GetMapping(value = "/read/{EmpNo}")
	public Employee secondPage(@PathVariable int EmpNo) {
		Employee employee = new Employee();
		employee.setEmpNo(123);
		employee.setEmpName("Teja");
		if (EmpNo == employee.getEmpNo()) {

			return employee;
		} else {
			return null;
		}
	}

	@GetMapping(value = "/readAll")

	public List<Employee> getEmployees() {
		// eager loading
		Employee employee1 = new Employee(10, "ten");
		Employee employee2 = new Employee(20, "twenty");
		Employee employee3 = new Employee(30, "thirty");
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee3);
		employees.add(employee1);
		employees.add(employee2);
		return employees;

	}

	// @RequestMapping(value="/create",method=RequestMethod.POST)
	@PostMapping(value = "/create")
	public Employee createOperation(@RequestBody Employee employee) throws InvalidEmployeeDetail {
		logger.warn("In controller the warning" + employee.getEmpNo());
		// System.out.println("received data emp No :" + employee.getEmpNo());
		System.out.println("received data emp Name :" + employee.getEmpName());
		this.employeeService.createEmployee(employee);
		return employee;

	}

	@GetMapping(value = "/readByNo/{EmpNo}")
	public Employee readByNo(@PathVariable int EmpNo) throws InvalidEmployeeDetail {
		Employee employee = this.employeeService.readEmployeeByNo(EmpNo);
		return employee;
	}

	@PutMapping(value = "/update")
	public Employee updateOperation(@RequestBody Employee employee) {
		System.out.println("received data emp No :" + employee.getEmpNo());
		System.out.println("received data emp Name :" + employee.getEmpName());
		this.employeeService.updateEmployee(employee);
		System.out.println("hi");
		return employee;

	}

	@DeleteMapping(value = "/delete//{empNo}")

	public String deleteOperation(@RequestBody Employee employee, @PathVariable int empNo) {

		System.out.println("Received data emp no : " + employee.getEmpNo());

		System.out.println("Received data emp name : " + employee.getEmpName());
		this.employeeService.deleteEmployeeByNo(empNo);

		return "Deleted:" + employee.getEmpNo();

	}

	@DeleteMapping(value = "/deleteById/{empNo}")
	public int deleteById(@PathVariable int empNo) {
		this.employeeService.deleteEmployeeByNo(empNo);
		return empNo;

	}

	@DeleteMapping(value = "/deleteByName/{empName}")
	public String deleteByName(@PathVariable String empName) {
		this.employeeService.deleteEmployeeByName(empName);
		return empName;

	}
}
