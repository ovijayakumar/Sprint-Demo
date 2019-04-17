package com.event.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.event.demo.model.User;
import com.event.demo.service.UserService;

@Component //@Service @Repository @Controller @RestController
public class LoginController {
	@Autowired
	UserService userService;//=new UserService();
	
	//Manual wiring
	
	
	/*public LoginController(String userService) {
		super();
		System.out.println("inside constructor String");		
	}
	
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}
	//constructor based injection 
	@Autowired
	public LoginController(UserService userService) {
		System.out.println("inside constructor");
		this.userService = userService;
	}*/
	
	//setter based injection
	/*public void setUserService(UserService userService) {
		System.out.println("inside setUserService");
		this.userService = userService;
	}*/
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
