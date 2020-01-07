package com.service;

import java.util.List;

import javax.activity.InvalidActivityException;

import com.appexception.InvalidEmployeeDetail;
import com.model.Employee;

public interface EmployeeService {
	public abstract Employee createEmployee(Employee employee)throws InvalidEmployeeDetail;

	public abstract Employee readEmployeeByNo(int empNo) throws InvalidEmployeeDetail;

	public abstract Employee readEmployeeByName(String empName);

	public abstract List<Employee> readEmployees();

	public abstract Employee updateEmployee(Employee employee);

	public abstract int deleteEmployeeByNo(int empNo);

	public abstract String deleteEmployeeByName(String empName);




}
