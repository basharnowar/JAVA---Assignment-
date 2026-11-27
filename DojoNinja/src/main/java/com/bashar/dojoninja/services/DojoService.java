package com.bashar.dojoninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bashar.dojoninja.models.Dojo;
import com.bashar.dojoninja.repositories.DojoRepository;

@Service
public class DojoService {
	
	private final DojoRepository dojoRepo;
	
	public DojoService(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo; 
	}
	
	public Dojo addDojo( String name) {
		
		//ArrayList<Dojo> dojos = new ArrayList<>();
		Dojo bashar = new Dojo(name);
		//dojos.add(name);
		
		
		return  dojoRepo.save(bashar);
	}
	
	public List<Dojo> allDojo() {
		return (List<Dojo>) dojoRepo.findAll();
		
	}
	
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
		if (optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}
	
	

}
