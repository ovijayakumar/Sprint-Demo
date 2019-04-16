package com.event.demo.controller;

import com.event.demo.model.User;
import com.event.demo.service.UserService;

public class LoginController {
	
	UserService userService;//=new UserService();
	
	//Manual wiring
	
	//constructor based injection 
	public LoginController(UserService userService) {
		System.out.println("inside constructor");
		this.userService = userService;
	}
	//setter based injection
	public void setUserService(UserService userService) {
		System.out.println("inside setUserService");
		this.userService = userService;
	}
	public String loginEndpoint(String userName,String password) {
		User user=new User(userName,password);
		boolean isValid=userService.validateUserCredential(user);
		if(isValid) {
			return "Welcome " + userName;
		}else {
			return "Invalid Credentials";
		}
		
	}

	
}
