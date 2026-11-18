package com.bashar.pathvariables.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/daikichi")
public class PathVariables {
	
	@RequestMapping("") 
		public String today() {
		return "Welcome!";
	}
	
	@RequestMapping("/travel/{city}")
	public String travel(@PathVariable("city") String city) {
		return "Congratulations! You will soon travel to " + city + "!";
	}
	
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable("number") int number) {
	    if (number % 2 == 0) {
	        return "You will take a grand journey in the near future but be wary of tempting offers.";
	    } else {
	        return "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";
	    }
	}
	
		
	

}