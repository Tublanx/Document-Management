package com.khfc.documentmng.domain;

import java.time.LocalDateTime;

public class Document {

	private Long id;

	private String docNum;

	private String docName;

	private String regName;

	private LocalDateTime regDate;

	public Long getId() {
		return id;
	}

	public String getDocNum() {
		return docNum;
	}

	public String getDocName() {
		return docName;
	}

	public String getRegName() {
		return regName;
	}

	public LocalDateTime getRegDate() {
		return regDate;
	}

}
