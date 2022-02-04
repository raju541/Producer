package com.scb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.dao.LoginDao;

@Service
public class LoginService {
	@Autowired
	LoginDao loginDao=null;
public  Boolean  loginAction(String uname, String pwd) {
	Boolean status=loginDao.loginAction(uname,pwd);
	
	return status;
	
}
}
