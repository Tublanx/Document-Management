package com.khfc.documentmng.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.khfc.documentmng.dto.UserDto;

@Mapper
public interface LoginMapper {

	public UserDto selUserByIdAndPwd(String userId, String userPwd);
	
	public int selUserByIdAndPwdCount(String userId, String userPwd);
	
}
