package com.khfc.documentmng.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.khfc.documentmng.dto.DocumentDto;

@Service
public interface AddDocService {

	public List<DocumentDto> selDocuments();

}
