package com.khfc.documentmng.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;

import com.khfc.documentmng.dto.UserDto;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@SpringBootTest
public class LoginMapperTest {

	@Autowired
	private LoginMapper loginMapper;
	
	@Test
	@DisplayName("조건에 맞는 유저 조회 테스트")
	void selUserTest() throws Exception {
		UserDto user = loginMapper.selUserByIdAndPwd("rlgus0823", "seon9053!");
		int userExistsCount = loginMapper.selUserByIdAndPwdCount("rlgus0823", "seon9053!");

		assertThat(user.getId()).isEqualTo(1);
		assertThat(userExistsCount).isEqualTo(1);
	}

}
