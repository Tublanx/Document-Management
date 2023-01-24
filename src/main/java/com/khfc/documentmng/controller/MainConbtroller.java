package com.khfc.documentmng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.khfc.documentmng.service.AddDocService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping(value = "/main")
@RequiredArgsConstructor
public class MainConbtroller {

	private final AddDocService addDocService;

	@GetMapping(value = "")
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

	@GetMapping(value = "/addDoc")
	public String addDocForm(Model model) {

		model.addAttribute("documentList", addDocService.selDocuments());

		return "doc/addDoc";
	}

	@GetMapping(value = "/outDoc")
	public String outDocForm() {
		return "doc/outDoc";
	}

	@GetMapping(value = "/moveDoc")
	public String moveDocForm() {
		return "docmng/moveDoc";
	}

	@GetMapping(value = "/usrPermissionMng")
	public String userPermissionMngForm() {
		return "usermng/permissionMng";
	}

	@GetMapping(value = "/editProfile")
	public String editProfileForm() {
		return "usermng/editProfile";
	}

	@GetMapping(value = "/setting")
	public String settingForm() {
		return "setting/setting";
	}

}
