package com.everis.services;

import java.util.List;

import com.everis.model.Parents;

public interface ParentsService {
	
	public void save(Parents parents);
	public void update(Parents parents);
	public List findAll();
//	public Parents findById(Long id);
	public void delete(Long id);
}
