package com.example.demo.service;

import java.util.List;

import com.example.demo.vo.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployees();
	public Employee saveEmployee(Employee employee);

}
