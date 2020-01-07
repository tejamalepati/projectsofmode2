package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDao;
import com.model.Employee;

@Service
@Transactional
public class EmployeeServiceimpl implements EmployeeService {
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public void saveData(Employee employee) {
		employeeDao.saveData(employee);
		
	}

	@Override
	public List<Employee> getAll() {
		return employeeDao.getAll();
		
	}

	@Override
	public void deleteById(int id) {
		employeeDao.deleteById(id);
		
	}

	

}
