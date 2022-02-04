package com.scb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.dao.EmployeDao;
import com.scb.model.Employeentity;
@Service
public class EmployeeService {
	@Autowired
	EmployeDao employeDao;
	public List<Employeentity> getAllEmployees(){
		
		List<Employeentity> list=employeDao.getAllEmployees();
		return list;	
	}
	public Employeentity getEmployeesId(int id) {
		// TODO Auto-generated method stub
		Employeentity employeentity=employeDao.getEmployeesId(id);
		return employeentity;
	}
	public List<Employeentity> deletebyEmployeesId(int id) {
		// TODO Auto-generated method stub
		List<Employeentity> dlist=employeDao.deletebyEmployeesId(id);
		return dlist;
	}
	public Employeentity updateEmployeesId(int id, String name) {
		// TODO Auto-generated method stub
		Employeentity employeentity=employeDao.updateEmployeesId(id,name);
		return employeentity;
	}
	public List<Employeentity> saveEmployees(Employeentity newEmployee) {
		// TODO Auto-generated method stub
		
		
		return employeDao.savenewEmployees(newEmployee);
	}

}
