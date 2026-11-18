package com.bashar.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
	

	
	@RequestMapping("/")
	public String human(@RequestParam(value="name", required=false, defaultValue="human") String name) {
		return "Hello " + name;
		
	}

}
