package com.scb.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.scb.pojo.LoginPojo;

@Repository
public class LoginDao {
	@Autowired
	LoginRepository loginRepository;
	public  Boolean  loginAction(String uname, String pwd) {
		List<LoginPojo> list= loginRepository.findAll();
		Boolean status=false;
		
		for (LoginPojo loginPojo : list) {
			if(loginPojo.getUname().equals(uname)&&loginPojo.getPwd().equals(pwd)) {
				
				status=true;
			}
		}

	
	return status;
	
	
	}
}
