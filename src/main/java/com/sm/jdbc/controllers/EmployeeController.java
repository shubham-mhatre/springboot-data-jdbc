package com.sm.jdbc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sm.jdbc.entity.Employee;
import com.sm.jdbc.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class EmployeeController {
	
	private final EmployeeService employeeService;

	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployeeById() {
		return employeeService.getAllEmployee();
	}
	
	@PostMapping("/employee")
	public int saveEmployee(Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@PutMapping("/employee")
	public int updateEmployee(Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/employee/{id}")
	public int deleteEmployeeByI(@PathVariable int id) {
		return employeeService.deleteStudentById(id);
	}
}
