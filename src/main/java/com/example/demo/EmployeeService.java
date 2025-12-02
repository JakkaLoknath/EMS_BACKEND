package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService 
{
	EmployeeRepo employeeRepo;
	
	public EmployeeService(EmployeeRepo employeeRepo)
	{
		this.employeeRepo = employeeRepo;
	}
	
	public List<Employee> getAllEmployees()
	{
		return employeeRepo.findAll();
	}
	
	public Employee getEmployeeById(int id)
	{
		return employeeRepo.findById(id).orElse(null);
	}
	
	public Employee insertOrUpdate(Employee e)
	{
		return employeeRepo.save(e);
	}
	
	public void deleteEmployee(int id)
	{
		employeeRepo.deleteById(id);
	}
}
