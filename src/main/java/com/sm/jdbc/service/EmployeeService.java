package com.sm.jdbc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sm.jdbc.entity.Employee;
import com.sm.jdbc.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee(){
		return employeeRepository.getAllEmployee();
	}
	
	public Employee getEmployeeById(Integer id) {
		return employeeRepository.getEmployeeById(id);
	}
	
	public int addEmployee(Employee employee) {
		return employeeRepository.addEmployee(employee);
	}
	
	public int updateEmployee(Employee employee) {
		return employeeRepository.updateEmployee(employee);
	}
	
	public int deleteStudentById(Integer id) {
		return employeeRepository.deleteStudentById(id);
	}

}
