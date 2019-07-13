package com.everis.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.model.Families;
import com.everis.repo.IFamiliesRepo;

@Service
public class FamiliesServiceImpl implements FamiliesService{

	@Autowired
	private IFamiliesRepo familiesrepo;
	
	@Override
	public void save(Families families) {
		familiesrepo.save(families);
		
	}

	@Override
	public void update(Families families) {
		familiesrepo.saveAndFlush(families);
		
	}	
	
	@Override
	public List findAll() {
		return familiesrepo.findAll();
	}

//	@Override
//	public Families findById(Long id) {
//		Optional result = familiesrepo.findById(id);
//		return result.get();
//	}

	@Override
	public void delete(Long id) {
		familiesrepo.deleteById(id);		
	}

}
