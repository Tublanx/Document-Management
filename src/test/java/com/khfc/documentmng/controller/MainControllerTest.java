package com.khfc.documentmng.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = MainConbtroller.class)
public class MainControllerTest {

	@Autowired
	MockMvc mockMvc;

	@Test
	@DisplayName("Controller 정상 작동 여부")
	void controllerTest() throws Exception {
		mockMvc.perform(get("/main")).andExpect(status().isOk());
	}

}
