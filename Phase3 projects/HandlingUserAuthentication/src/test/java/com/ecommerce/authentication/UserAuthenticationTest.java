package com.ecommerce.authentication;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserAuthenticationTest {

	@Test
	public void testLoginSuccess() {
		UserAuthentication user = new UserAuthentication();
		assertTrue(user.login("admin", "password"));
		System.out.println("Login Successful");
	}
	
	@Test
	public void testLoginFailure1() {
		UserAuthentication user = new UserAuthentication();
		assertFalse(user.login("admin", "123456"));
		System.out.println("Wrong password.");
	}
	
	@Test
	public void testLoginFailure2() {
		UserAuthentication user = new UserAuthentication();
		assertFalse(user.login("username", "password"));
		System.out.println("Wrong User Id.");
	}
	
}
