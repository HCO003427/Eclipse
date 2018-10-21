/*package com.chetan.learningspring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chetan.learningspring.model.Employee;
import com.chetan.learningspring.repo.EmployeeRepo;


@RestController
public class EmployeeRestController {
	
	@Autowired
	EmployeeRepo repo;
	
	@GetMapping(path="/Employees")
	public List<Employee> getEmployees(){
		
		return repo.findAll();
		
	}
	
	@GetMapping(path="/Employees/{eid}", produces= {"application/json"})
	public Employee getOneEmployee(@PathVariable ("eid") int eid) {
		
		
		return repo.getOne(eid);
		
	}
	
	@PostMapping(path="/Employees")
	public Employee addEmployee(@RequestBody Employee emp) {
		
		repo.save(emp);
		return emp;
		
	}
	
}
*/