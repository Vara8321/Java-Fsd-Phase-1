package com.ecommerce.authentication;

public class UserAuthentication {

	public boolean login(String username, String password) {
		return "admin".equals(username) && "password".equals(password);
	}
	
}
