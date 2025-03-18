package com.sm.jdbc.repository;

import java.util.List;

import com.sm.jdbc.entity.Employee;

public interface EmployeeRepository {
	
	int addEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee getEmployeeById(int id);
	int updateEmployee(Employee employee);
	int deleteStudentById(int id);

}
