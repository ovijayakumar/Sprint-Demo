package com.event.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.event.demo.model.User;

@Component //@Service @Repository @Controller @RestController
public class UserService {
	
	
	public UserService() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Value("${username1}")
	String userName;
	
	@Value("${password}")
	String password;
	
	@Value("${rating}")
	float rating; 
	public boolean validateUserCredential(User user) {
		
		System.out.println("Rating=>"+rating);
		boolean isValid=false;
		//JDBC Code Backend Connectivity
		if(user.getUserName().equals(userName) && user.getPassword().equals(password)) {
			isValid=true;
		}
		return isValid;		
		
	}
	
}
