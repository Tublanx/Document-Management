package com.khfc.documentmng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MainConbtroller {

	@GetMapping(value = "/main")
	public String main(HttpServletRequest request, Model model) {

		HttpSession session = request.getSession();

		if (session == null) {
			return "login";
		}

		String userId = String.valueOf(session.getAttribute("userId"));

		if (userId == null) {
			return "login";
		}

		model.addAttribute("userId", userId);

		return "main";
	}

}
