package com.scb.dao;

import org.springframework.stereotype.Repository;

import com.scb.model.Employeentity;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface EmpRepository extends JpaRepository<Employeentity ,Integer> {

}
