package com.test.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private String fname;
	private String income;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String fname, String income) {
		super();
		this.id = id;
		this.fname = fname;
		this.income = income;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", income=" + income + "]";
	}

}
