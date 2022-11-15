package com.app.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.employee.model.Employee;
import com.app.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	//Create Employee
	public Employee addEmployee(Employee emp) {
		return repository.save(emp);
	}
	
	//Get Employee
	public List<Employee> getEmployees() {
	     return repository.findAll();
	 }
	
	//Update Employee
	public Employee updateEmployee(Employee emp) {
		return repository.save(emp);
	}
	
	//Delete Employee
	public void deleteEmployee(int empid) {
		repository.deleteById(empid);
	}
}
