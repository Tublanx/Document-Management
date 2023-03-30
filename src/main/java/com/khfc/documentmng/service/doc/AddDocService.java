package com.khfc.documentmng.service.doc;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.khfc.documentmng.dto.DocumentDto;

@Service
public interface AddDocService {

	public List<DocumentDto> selDocuments();

	public List<DocumentDto> search(String docNo, String docName, LocalDate startDate, LocalDate endDate);

}
