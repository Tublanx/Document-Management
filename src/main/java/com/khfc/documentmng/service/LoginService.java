package com.khfc.documentmng.service;

import org.springframework.stereotype.Service;

import com.khfc.documentmng.dto.UserDto;

@Service
public interface LoginService {

	public UserDto selUserByIdAndPwd(String userId, String userPwd);

	public int selUserByIdAndPwdCount(String userId, String userPwd);

}
