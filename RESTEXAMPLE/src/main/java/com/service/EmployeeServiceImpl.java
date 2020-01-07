package com.service;

import java.util.List;

import javax.activity.InvalidActivityException;

import com.appexception.InvalidEmployeeDetail;
import com.dao.EmployeeDAO;
import com.model.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public Employee createEmployee(Employee employee) {
		Employee localEmployee = null;

		if (employee != null && employee.getEmpName().length() > 0) {
			System.out.println("create() in service layer");
			localEmployee = this.employeeDAO.createEmployee(employee);
		} else {

		}
		return localEmployee;

	}

	@Override

	public Employee readEmployeeByNo(int empNo) throws InvalidEmployeeDetail {

		Employee employee = null;

		if (empNo < 0) {

			throw new InvalidEmployeeDetail();

		}

		else {

			employee = new Employee(10, "saikrishna");

		}

		return employee;

	}

	@Override
	public Employee readEmployeeByName(String empName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> readEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		this.employeeDAO.updateEmployee(employee);

		return employee;

	}

	@Override
	public int deleteEmployeeByNo(int empNo) {
		employeeDAO.deleteEmployeeByNo(empNo);
		return empNo;

	}

	@Override
	public String deleteEmployeeByName(String empName) {
		employeeDAO.deleteEmployeeByName(empName);
		return empName;


	}

}
