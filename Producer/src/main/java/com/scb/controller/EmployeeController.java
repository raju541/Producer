package com.scb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scb.model.Employeentity;
import com.scb.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
		@GetMapping
	    public ResponseEntity<List<Employeentity>> getAllEmployees() {
	        List<Employeentity> list = employeeService.getAllEmployees();
	        return new ResponseEntity<List<Employeentity>>(list, new HttpHeaders(), HttpStatus.OK);
	    }
		 @GetMapping("/{id}")
	    public ResponseEntity<Employeentity> getEmployeesId(@PathVariable("id") int id) {
	        Employeentity employeentity = employeeService. getEmployeesId(id);
	        return new ResponseEntity<Employeentity>(employeentity,	new HttpHeaders(), HttpStatus.OK);
	    }
		 @PutMapping("/{id}/{name}")
		    public ResponseEntity<Employeentity> updateEmployeesId(@PathVariable("id") int id,@PathVariable("name") String name) {
		        Employeentity employeentity = employeeService.updateEmployeesId(id,name);
		        return new ResponseEntity<Employeentity>(employeentity,	new HttpHeaders(), HttpStatus.OK);
		 } 
		 @DeleteMapping("/{id}")
		    public ResponseEntity<List<Employeentity>> deletebyEmployeesId(@PathVariable("id") int id) {
			 List<Employeentity> list = employeeService.deletebyEmployeesId(id);
		        return new ResponseEntity<List<Employeentity>>(list, new HttpHeaders(), HttpStatus.OK);
		  }
		 @PostMapping
		    public ResponseEntity<List<Employeentity>> save(@RequestBody Employeentity newEmployee) {
			 List<Employeentity> list = employeeService.saveEmployees(newEmployee);
		        return new ResponseEntity<List<Employeentity>>(list, new HttpHeaders(), HttpStatus.OK);
		  }
}
