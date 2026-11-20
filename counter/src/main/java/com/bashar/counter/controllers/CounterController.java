package com.bashar.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
	@GetMapping("/counter")
	public String count(HttpSession session) {
	return "counter.jsp";
	}
	
	@GetMapping("/your_server")
	public String myServer(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		
	} else {
		Integer current = (Integer) session.getAttribute("count");
		session.setAttribute("count", current + 1);
	}
		return "your_server.jsp";
	}
	
	
}
