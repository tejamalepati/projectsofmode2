package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDAO {
	public abstract Employee createEmployee(Employee employee);

	public abstract Employee readEmployeeByNo(int empNo);

	public abstract Employee readEmployeeByName(String empName);

	public abstract List<Employee> readEmployees();

	public abstract Employee updateEmployee(Employee employee);

	public abstract int deleteEmployeeByNo(int empNo);

	public abstract String deleteEmployeeByName(String empName);

	
}
