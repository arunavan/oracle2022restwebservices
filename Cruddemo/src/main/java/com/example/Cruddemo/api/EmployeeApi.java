package com.example.Cruddemo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Cruddemo.model.Employee;
import com.example.Cruddemo.service.EmployeeService;

@RestController  //@PATH
public class EmployeeApi {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employee") // @GET ,
	public ResponseEntity<List<Employee>> getallEmployees(){
		 List<Employee> elist=employeeService.getallEmployees();
		return new ResponseEntity<>(elist,HttpStatus.OK);
		
	}
	@PostMapping(value="/employee") // @GET ,
	public String  addEmployee(@RequestBody Employee employee){
		System.out.println(employee);
		String s= employeeService.addEmployee(employee);
		return "Added"; //new ResponseEntity<>("Employee Added",HttpStatus.OK);
		
	}
	

}
