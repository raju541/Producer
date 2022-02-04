package com.scb.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.scb.model.Employeentity;
@Repository
public class EmployeDao {
	@Autowired
    EmpRepository empRepository;

	List<Employeentity> list=null;
	/*
	 * public EmployeDao() { list=new ArrayList<Employeentity>(); Employeentity
	 * employeentity1=new Employeentity(); Employeentity employeentity2=new
	 * Employeentity(); employeentity1.setId(1); employeentity1.setName("prasad");
	 * employeentity1.setMobile("1234"); employeentity1.setAddress("dommeru");
	 * employeentity2.setId(2); employeentity2.setName("raju");
	 * employeentity2.setMobile("1784"); employeentity2.setAddress("eluru");
	 * list.add(employeentity1); list.add(employeentity2); }
	 */
	@Cacheable("prasadcache")
	public List<Employeentity> getAllEmployees(){
	System.out.println("we are in database method");
//	List<Employeentity> list=empRepository.findAll();

		return empRepository.findAll();	
	}

	public Employeentity getEmployeesId(int id) {
		
		return empRepository.findById(id).get();
	}

	public List<Employeentity> deletebyEmployeesId(int id) {
		
		empRepository.deleteById(id);
		
		/*
		 * List<Employeentity> dlist=new ArrayList<Employeentity>(); for (Employeentity
		 * employeentity : list) { if(employeentity.getId()==id) {
		 * 
		 * list.remove(employeentity); } else dlist.add(employeentity); }
		 */
		return empRepository.findAll();	
	}
	
	public Employeentity updateEmployeesId(int id, String name) {
		Employeentity employeenent= empRepository.findById(id).get();
		list=empRepository.findAll();	
		for (Employeentity employeentity : list) {
			if(employeentity.getId()==id) {
				employeentity.setName(name);
				employeenent=employeentity;
			}			
		}
		return employeenent;
	}

	public List<Employeentity> savenewEmployees(Employeentity newEmployee) {
		
		empRepository.save(newEmployee);
		return empRepository.findAll();	
	}
}
