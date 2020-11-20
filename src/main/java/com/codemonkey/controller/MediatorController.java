package com.codemonkey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/")
public class MediatorController {

    private final Logger LOGGER = LoggerFactory.getLogger(MediatorController.class);

	@RequestMapping
	public String getHomePage() {
        LOGGER.info("Nos redirecciona a http://localhost:8080/home");
		return "redirect:/home";
	}
}