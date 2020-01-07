package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Employee;
import com.repository.EmployeeRepository;

public interface EmployeeDao {

	void saveData(Employee employee);

	List<Employee> getAll();

	void deleteById(int id);

	

	
}
