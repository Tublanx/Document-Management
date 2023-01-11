package com.khfc.documentmng.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.khfc.documentmng.mapper.LoginMapper;
import com.khfc.documentmng.service.LoginService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	private final LoginMapper loginMapper;

	private final LoginService loginService;

	@GetMapping(value = "/login")
	public String loginForm() {
		return "login";
	}

	@PostMapping(value = "/login/login.do")
	public String newMainForm(@RequestParam("userId") String userId, @RequestParam("userPwd") String userPwd,
			Model model) {

		model.addAttribute("userId", userId);
		model.addAttribute("userPwd", userPwd);

		logger.info("userId => " + userId);
		logger.info("userPwd => " + userPwd);

		int userExistsCount = loginService.selUserByIdAndPwdCount(userId, userPwd);

		if (userExistsCount > 0) {
			loginService.selUserByIdAndPwd(userId, userPwd);
			return "main";
		} else {
			logger.error("정보가 존재하지 않습니다.");
			return "redirect:/login";
		}

	}

}
