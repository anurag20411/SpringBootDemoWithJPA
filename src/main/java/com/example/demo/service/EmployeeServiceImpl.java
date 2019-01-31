package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.vo.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
EmployeeRepository  employeeRepository;
public EmployeeServiceImpl(EmployeeRepository  employeeRepository) {
	employeeRepository=this.employeeRepository;
}

	@Override
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		 return employeeRepository.save(employee);
		
	}

}
