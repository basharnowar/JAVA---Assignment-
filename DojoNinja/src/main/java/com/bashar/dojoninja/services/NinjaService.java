package com.bashar.dojoninja.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bashar.dojoninja.models.Ninja;
import com.bashar.dojoninja.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	private final NinjaRepository ninjaRepo;
	
	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	public Ninja addNinja(Ninja ninja) {
		
		
		
		return ninjaRepo.save(ninja);
	}
	
	public List<Ninja> allNinja() {
		return (List<Ninja>) ninjaRepo.findAll();
	}
	
	

}
