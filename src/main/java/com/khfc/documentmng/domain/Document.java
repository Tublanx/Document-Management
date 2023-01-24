package com.khfc.documentmng.domain;

import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public class Document {

	private Long id;

	private String docNum;

	private String docName;

	private String regName;

	private LocalDateTime regDate;

}
