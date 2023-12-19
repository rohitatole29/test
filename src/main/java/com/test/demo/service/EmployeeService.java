package com.test.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.test.demo.dao.EmployeeDao;
import com.test.demo.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;

	public Employee save(@RequestBody Employee employee) {
		return dao.saveDetails(employee);
	}

	public Employee updateDetails(@RequestBody Employee employee) {
		return dao.updateDetails(employee);
	}

	public Employee deleteDetails(@PathVariable int id) {
		return dao.deleteDetails(id);
	}

	public Employee getDetails(@PathVariable int id) {
		return dao.getDetails(id);
	}
}
