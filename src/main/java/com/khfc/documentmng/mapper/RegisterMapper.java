package com.khfc.documentmng.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.khfc.documentmng.dto.UserDto;

@Mapper
public interface RegisterMapper {

	public void insertUser(UserDto userDto);
	
	public int selUserByUserIdCount(String userId);

}
