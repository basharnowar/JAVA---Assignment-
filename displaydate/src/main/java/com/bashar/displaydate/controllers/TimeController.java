package com.bashar.displaydate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;

@Controller
public class TimeController {
	
	@RequestMapping("/")
	public String dashboard() {
		return "dashboard.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		model.addAttribute("today", new Date());
		
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		model.addAttribute("today", new Date());
		
		return "time.jsp";
	}

}
