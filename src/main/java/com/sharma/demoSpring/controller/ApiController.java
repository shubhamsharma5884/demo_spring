package com.sharma.demoSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping("pulse")
	public String getPulse(){
		return "I am Alive";
	}
}
