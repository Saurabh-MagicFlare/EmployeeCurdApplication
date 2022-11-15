package com.app.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.employee.model.Employee;
import com.app.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	//Create Employee
	@PostMapping(value= "/employee/add")
	public Employee createEmployee(@RequestBody Employee newemp) {
		return service.addEmployee(newemp);
	}

	//Get All Employees
	@GetMapping(value= "/employee/all")
	public List<Employee> getEmployees() {
		return service.getEmployees();
	}

	//Update Employee
	@PutMapping(value= "/employee/update/{id}")
	public Employee updateEmployee(@RequestBody Employee updemp, @PathVariable int id) {
	    updemp.setId(id);
		return service.updateEmployee(updemp);
	}
	
	//Delete Employee
	@DeleteMapping(value= "/employee/delete/{id}")
	public void deleteEmployeeById(@PathVariable int id)
	{
		service.deleteEmployee(id);
	}
}
