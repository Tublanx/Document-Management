package com.khfc.documentmng.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class DocumentDto {

	private Long id;

	private String docNum;

	private String docName;

	private String regName;

	private LocalDateTime regDate;

	public DocumentDto(String docNum, String docName, String regName, LocalDateTime regDate) {
		this.docNum = docNum;
		this.docName = docName;
		this.regName = regName;
		this.regDate = regDate;
	}

}
