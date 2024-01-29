package com.ecommerce;

public class User {

	private long userId;
	private String userName;
	private String userAdress;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAdress() {
		return userAdress;
	}
	public void setUserAdress(String userAdress) {
		this.userAdress = userAdress;
	}
	public User(long userId, String userName, String userAdress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAdress = userAdress;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAdress=" + userAdress + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
