package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.model.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Employee createEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		session.save(employee);
		return employee;
	}

	@Override
	public Employee readEmployeeByNo(int empNo) {
		// TODO Auto-generated method stub
		return null;
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
		Session session = sessionFactory.getCurrentSession();
		session.update(employee);
		return employee;

	}

	@Override
	public int deleteEmployeeByNo(int empNo) {
		Session session = sessionFactory.getCurrentSession();
		Employee e = session.load(Employee.class,empNo);
		if (null != e) {
			session.delete(e);
		}
		return empNo;
	}
		
		

	@Override
	public String deleteEmployeeByName(String empName) {
		Session s = sessionFactory.getCurrentSession();
		Employee e = s.load(Employee.class,empName);
		if (null != e) {
			s.delete(e);
		}
		
		
		return empName;
	}

	

}
