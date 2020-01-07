package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {

	void saveData(Employee employee);

	List<Employee> getAll();

	void deleteById(int id);


}
