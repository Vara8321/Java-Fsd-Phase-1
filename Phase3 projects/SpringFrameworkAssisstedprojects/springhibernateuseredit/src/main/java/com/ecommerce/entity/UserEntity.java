package com.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name="user")
public class UserEntity {

	@Id
	@GeneratedValue
	@Column(name="userId")
	private long userId;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="userAddress")
	private String userAddress;

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

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + "]";
	}

	public UserEntity(long userId, String userName, String userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
	}

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
