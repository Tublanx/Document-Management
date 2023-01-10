package com.khfc.documentmng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping(value = "/main")
	public String t() {
		return "test";
	}
	
}
