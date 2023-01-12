package com.khfc.documentmng.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserDto {

	private Long id;

	private String userId;

	private String userPwd;

	private String userName;

	private int userAge;

	private String userPhone;

	private String userBirth;

	private String role;

	public UserDto(String userId, String userPwd, String userName, int userAge, String userPhone, String userBirth) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.userAge = userAge;
		this.userPhone = userPhone;
		this.userBirth = userBirth;
	}

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
