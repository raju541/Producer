package com.scb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.scb.pojo.LoginPojo;
@Repository
public interface LoginRepository extends JpaRepository<LoginPojo ,Integer> {

}
