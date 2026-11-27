package com.bashar.dojoninja.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bashar.dojoninja.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository <Ninja, Long> {


	
	

}
