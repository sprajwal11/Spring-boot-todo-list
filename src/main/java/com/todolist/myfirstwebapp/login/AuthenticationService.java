package com.todolist.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName= username.equalsIgnoreCase("Prajwal");
		boolean isValidPassword= password.equals("password123");
		
		
		return isValidPassword && isValidUserName;
	}
}
