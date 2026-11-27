package com.bashar.dojoninja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bashar.dojoninja.models.Dojo;
import com.bashar.dojoninja.models.Ninja;
import com.bashar.dojoninja.services.DojoService;
import com.bashar.dojoninja.services.NinjaService;

@Controller
public class DojoController {
	
	private final DojoService dojoService;
	
	private final NinjaService ninjaService;
	
	
	public DojoController(DojoService dojoService, NinjaService ninjaService) {
		this.ninjaService = ninjaService;
		this.dojoService = dojoService;
	}
	

	@GetMapping("/")
	public String index() {
		return "dojo.jsp";
	}
	
	@PostMapping("/createdojo")
	public String createDojo(@RequestParam(value="name") String name, Model model) {
		
		dojoService.addDojo(name);
		
		return "redirect:/ninja";
		
	}
	
	@GetMapping("/ninja")
	public String ninja(Model model) {
		model.addAttribute("dojos", dojoService.allDojo());
		return "ninja.jsp";
	}
	
	@PostMapping("/createninja")
	public String createNinja(@RequestParam(value="firstName") String firstName, @RequestParam(value="lastName") String lastName,@RequestParam(value="age") int age,@RequestParam(value="dojoid") Long dojoid, Model model) {
		Ninja ninja = new Ninja(firstName, lastName, age);
		Dojo dojo1 = dojoService.findDojo(dojoid);
		ninja.setDojo(dojo1);
		ninjaService.addNinja(ninja);
		
		return "redirect:/showdojo/" + dojoid;
	}
	
	
	@GetMapping("/showdojo/{id}")
	public String showDojo(@PathVariable(value="id") Long dojoid,  Model model) {
		
		model.addAttribute("dojo", dojoService.findDojo(dojoid));
		
		
		return "dojo_ninja.jsp";
	}
	
}
