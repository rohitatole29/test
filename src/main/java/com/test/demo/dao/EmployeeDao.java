package com.test.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.test.demo.entity.*;

@Repository
public class EmployeeDao {

	@Autowired
	SessionFactory sessionFactory;

	public Employee saveDetails(@RequestBody Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
		session.close();
		return employee;
	}

	public Employee updateDetails(@RequestBody Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(employee);
		transaction.commit();
		session.close();
		return employee;
	}

	public Employee deleteDetails(@PathVariable int id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = session.get(Employee.class, id);
		session.delete(employee);
		transaction.commit();
		return employee;
	}
	
	public Employee getDetails(@PathVariable int id) {
		Session session = sessionFactory.openSession();
		Employee employee = session.get(Employee.class, id);
		return employee;
	}
}



