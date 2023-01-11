package com.khfc.documentmng.domain;

public class User {

	private Long id;
	
	private String userId;
	
	private String userPwd;

	private String userName;

	private int userAge;

	private String userPhone;

	private String userBirth;

	private String role;


	public String getUserName() {
		return userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public String getUserBirth() {
		return userBirth;
	}

	public String getRole() {
		return role;
	}

	public Long getId() {
		return id;
	}

	
	public String getUserId() {
		return userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
}
