package com.khfc.documentmng.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
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
	
}
