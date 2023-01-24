package com.khfc.documentmng.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.khfc.documentmng.dto.DocumentDto;

@Mapper
public interface AddDocMapper {

	public List<DocumentDto> selDocuments();
	
}
