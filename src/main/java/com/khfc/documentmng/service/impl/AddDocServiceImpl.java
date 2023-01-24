package com.khfc.documentmng.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.khfc.documentmng.dto.DocumentDto;
import com.khfc.documentmng.mapper.AddDocMapper;
import com.khfc.documentmng.service.AddDocService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AddDocServiceImpl implements AddDocService {

	private final AddDocMapper addDocMapper;

	@Override
	public List<DocumentDto> selDocuments() {
		return addDocMapper.selDocuments();
	}

}
