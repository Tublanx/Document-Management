package com.khfc.documentmng.service.impl;

import org.springframework.stereotype.Service;

import com.khfc.documentmng.dto.UserDto;
import com.khfc.documentmng.mapper.RegisterMapper;
import com.khfc.documentmng.service.RegisterService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RegisterServiceImpl implements RegisterService {

	private final RegisterMapper registerMapper;

	@Override
	public void insertUser(UserDto userDto) {
		registerMapper.insertUser(userDto);
	}

	@Override
	public int selUserByUserIdCount(String userId) {
		return registerMapper.selUserByUserIdCount(userId);
	}

}
