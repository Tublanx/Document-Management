package com.khfc.documentmng.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.khfc.documentmng.dto.UserDto;
import com.khfc.documentmng.service.RegisterService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class RegisterController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	private final RegisterService registerService;

	@GetMapping(value = "/register")
	public String registerForm() {
		return "register";
	}

	@PostMapping(value = "/register/register.do")
	public String register(UserDto userDto) {
		logger.info(userDto.getUserId() + "/" + userDto.getUserName());
		int userExistsCount = registerService.selUserByUserIdCount(userDto.getUserId());

		if (userExistsCount > 0) {
			logger.error("존재하지 않는 정보입니다.");
			return "redirect:/register";
		}

		registerService.insertUser(userDto);
		return "redirect:/login";
	}

}
