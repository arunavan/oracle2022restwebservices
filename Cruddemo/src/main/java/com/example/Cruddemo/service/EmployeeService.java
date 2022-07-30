package com.example.Cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Cruddemo.model.Employee;
import com.example.Cruddemo.repository.EmployeeRepository;

@Service
//@Transactional
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getallEmployees(){
		return employeeRepository.getAllEmployees();
	}
	
	public String addEmployee(Employee employee) {
		String s=employeeRepository.addEmployee(employee);
		return s;
	}

}
