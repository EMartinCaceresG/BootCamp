package com.everis.services;

import java.util.List;

import com.everis.model.Students;

public interface StudentsService {
	
	public void save(Students students);
	public void update(Students students);
	public List findAll();
//	public Students findById(Long id);
	public void delete(Long id);
}
