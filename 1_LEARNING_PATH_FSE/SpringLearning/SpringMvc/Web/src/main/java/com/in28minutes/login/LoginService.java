package com.in28minutes.login;

import org.springframework.stereotype.Service;

// component scan inside the todoservlet.xml finds the service
@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("rohith") && password.equals("rohith");
	}

}