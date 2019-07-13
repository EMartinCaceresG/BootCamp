package com.everis.services;

import java.util.List;

import com.everis.model.Families;

public interface FamiliesService {
	
	public void save(Families families);
	public void update(Families families);
	public List findAll();
//	public Families findById(Long id);
	public void delete(Long id);
}
