package com.example.Cruddemo.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Cruddemo.model.Employee;

@Repository
public class EmployeeRepository {
	static List<Employee> elist= new ArrayList();
static {
	//List.of();//
	          elist.add(new Employee(1,"ram","ram@oracle.com"));
			  elist.add(	new Employee(2,"ram2","ram@oracle.com"));
			  elist.add(new Employee(3,"ram3","ram@oracle.com"));
			  elist.add(new Employee(4,"ram4","ram@oracle.com"));
}

    public List<Employee> getAllEmployees(){
    	return elist;
    }
    public String  addEmployee(Employee employee) {
    	Employee e1=new Employee();
    	e1.setId(employee.getId());
    	e1.setName(employee.getName());
    	e1.setEmail(employee.getEmail());
    	elist.add(e1);
    	return "added";
    }
    public void deleteEmployee(Integer id) {
    	
    }
    public void updateEmployee(Integer id) {
    	
    }
    public Employee getEmployeebyId(Integer id) {
    	return new Employee();
    }
    
	
}
