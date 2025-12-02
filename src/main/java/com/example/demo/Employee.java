package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int emp_id;
	
	@Column
	String emp_name;
	
	@Column
	String department;
	
	@Column
	String city;
	
	@Column
	double salary;

	public Employee() {
		super();
	}

	public Employee(int emp_id, String emp_name, String department, String city, double salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.department = department;
		this.city = city;
		this.salary = salary;
	}

	public Employee(String emp_name, String department, String city, double salary) {
		super();
		this.emp_name = emp_name;
		this.department = department;
		this.city = city;
		this.salary = salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
