package com.example.demo;

import java.util.List;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(
    origins = {
        "https://ems-frontend-snowy-eight.vercel.app",
        "http://localhost:5173"
    },
    methods = {
        RequestMethod.GET,
        RequestMethod.POST,
        RequestMethod.PUT,
        RequestMethod.DELETE,
        RequestMethod.OPTIONS
    }
)

public class EmployeeController 
{
	EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService)
	{
		this.employeeService = employeeService;
	}
	
	@GetMapping("/health")
	public String health()
	{
		return "ok";
	}
	
	@GetMapping("/getallemployees")
	public List<Employee> all()
	{
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/getemployee/{id}")
	public Employee byId(@PathVariable int id)
	{
		return employeeService.getEmployeeById(id);
	}
	
	@PostMapping("/addemployee")
	public Employee insertOrUpdate(@RequestBody Employee e)
	{
		return employeeService.insertOrUpdate(e);
	}
	
	@DeleteMapping("/removeemployee/{id}")
	public String delete(@PathVariable int id)
	{
		employeeService.deleteEmployee(id);
		return "DELETION SUCCESS";
	}
}
