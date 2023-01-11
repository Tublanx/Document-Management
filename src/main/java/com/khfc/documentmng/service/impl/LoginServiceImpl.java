package com.khfc.documentmng.service.impl;

import org.springframework.stereotype.Service;

import com.khfc.documentmng.dto.UserDto;
import com.khfc.documentmng.mapper.LoginMapper;
import com.khfc.documentmng.service.LoginService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

	private final LoginMapper loginMapper;

	@Override
	public UserDto selUserByIdAndPwd(String userId, String userPwd) {
		return loginMapper.selUserByIdAndPwd(userId, userPwd);
	}

	@Override
	public int selUserByIdAndPwdCount(String userId, String userPwd) {
		return loginMapper.selUserByIdAndPwdCount(userId, userPwd);
	}

}
