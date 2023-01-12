package com.khfc.documentmng.service;

import org.springframework.stereotype.Service;

import com.khfc.documentmng.dto.UserDto;

@Service
public interface RegisterService {

	public void insertUser(UserDto userDto);
	
}
