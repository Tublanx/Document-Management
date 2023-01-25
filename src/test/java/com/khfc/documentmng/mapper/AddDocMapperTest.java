package com.khfc.documentmng.mapper;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;

import com.khfc.documentmng.controller.LoginController;
import com.khfc.documentmng.dto.DocumentDto;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@SpringBootTest
public class AddDocMapperTest {

	@Autowired
	private AddDocMapper addDocMapper;

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Test
	@DisplayName("문서입고내역 조회 테스트")
	void selDocumentsTest() throws Exception {
		List<DocumentDto> documentList = addDocMapper.selDocuments();
		logger.info(documentList.toString());
	}

}
