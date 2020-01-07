package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Employee;
import com.repository.EmployeeRepository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void saveData(Employee employee) {
		
		employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAll() {
		
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public void deleteById(int id) {
		employeeRepository.delete(id);
	}

	
}
