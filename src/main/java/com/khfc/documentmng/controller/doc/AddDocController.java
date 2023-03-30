package com.khfc.documentmng.controller.doc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.khfc.documentmng.service.doc.AddDocService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/main/addDoc")
public class AddDocController {

	private final AddDocService addDocService;
	
	@GetMapping
	public String addDocForm(Model model) {
		model.addAttribute("documentList", addDocService.selDocuments());
		return "doc/addDoc";
	}
	
}
