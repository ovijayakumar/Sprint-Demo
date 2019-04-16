package com.event.demo.service;

import com.event.demo.model.User;

public class UserService {
	
	
	public UserService(String name) {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean validateUserCredential(User user) {
		
		boolean isValid=false;
		//JDBC Code Backend Connectivity
		if(user.getUserName().equals("vijay") && user.getPassword().equals("kumar")) {
			isValid=true;
		}
		return isValid;		
		
	}
	
}
