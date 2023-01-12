package com.khfc.documentmng.mapper;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;

import com.khfc.documentmng.dto.UserDto;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@SpringBootTest
public class RegisterMapperTest {

	@Autowired
	private RegisterMapper registerMapper;

	@Test
	@DisplayName("회원가입 테스트")
	void registerTest() throws Exception {
		UserDto user = new UserDto("test", "test1234", "테스트", 20, "010-1234-1234", "2000-01-01");
		registerMapper.insertUser(user);
	}

}
