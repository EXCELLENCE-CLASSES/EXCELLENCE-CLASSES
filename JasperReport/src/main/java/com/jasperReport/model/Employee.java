package com.jasperReport.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	int id;
	
	String name;
	
	String disignation ;
	
	long salary ;
	
	String doj;

	public Employee(int id, String name, String disignation, long salary, String doj) {
		super();
		this.id = id;
		this.name = name;
		this.disignation = disignation;
		this.salary = salary;
		this.doj = doj;
	}

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisignation() {
		return disignation;
	}

	public void setDisignation(String disignation) {
		this.disignation = disignation;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", disignation=" + disignation + ", salary=" + salary
				+ ", doj=" + doj + "]";
	}
	
	
	
}
