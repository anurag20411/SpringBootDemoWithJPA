package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import com.example.demo.vo.Employee;

@RestController
@RequestMapping("/api")
public  class EmployeeController {
	 @Autowired
	    private EmployeeService employeeService;
	
	 @GetMapping("/getemployees")
	    public List<Employee> getAllEmployees() {
	        return employeeService.getEmployees();
	    }
	 
	  @PostMapping("/updateEmployees")
	    public Employee createEmployee(@Valid @RequestBody Employee employee) {
	        return employeeService.saveEmployee(employee);
	    }
}
