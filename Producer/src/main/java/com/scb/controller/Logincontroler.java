package com.scb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.scb.service.LoginService;

@Controller
public class Logincontroler {
	@Autowired
	LoginService loginService=null;
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	  @GetMapping("/loginaction") 
	  public String loginAction(@RequestParam("uname") String uname,@RequestParam("pwd") String pwd) { 
		  System.out.println(uname +"####################"+pwd);
		boolean  status=loginService.loginAction(uname,pwd);
		if(status==true) {
			System.out.println("Login success");
			return "loginsuccess";
		}
		else {
			System.out.println("Login failure");
			return "loginfailure";
		}
		
		
		  
	}
	 
}
