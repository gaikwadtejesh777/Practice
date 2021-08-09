package com.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	@RequestMapping("/welcome")
	public String welcome() {
		
		String text = "Welcome User";
		
		return text;
		
	}
	

	@RequestMapping("/getusers")
	public String getUser() {
	
		return "{\"name\":\"Tejesh\"}";
		
	}
}
