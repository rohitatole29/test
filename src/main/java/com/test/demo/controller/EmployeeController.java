package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.entity.Employee;
import com.test.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("SaveDetalis")
	public Employee saveDetails(@RequestBody Employee employee) {
		return service.save(employee);
	}

	@PutMapping("updatedetails")
	public Employee updateDetails(@RequestBody Employee employee) {
		return service.updateDetails(employee);
	}

	@DeleteMapping("deletedetails/{id}")
	public Employee deleteDetails(@PathVariable int id) {
		return service.deleteDetails(id);
	}

	@GetMapping("getdetails/{id}")
	public Employee getDetails(@PathVariable int id) {
		return service.getDetails(id);
	}
}
