package com.demo.bot.descarga.encabezado.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class HelloController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String sayWelcome() {
		return "Welcome to this demo!!";
	}
	
	@RequestMapping(value = "/chao", method = RequestMethod.GET)
	public String sayGoodbye() {
		return "Get out of this demo!!";
	}
}
