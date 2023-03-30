package com.khfc.documentmng.mapper.doc;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.khfc.documentmng.dto.DocumentDto;

@Mapper
public interface AddDocMapper {

	public List<DocumentDto> selDocuments();
	
	public List<DocumentDto> search(String docNo, String docName, LocalDate startDate, LocalDate endDate);
	
}
