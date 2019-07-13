package com.everis.services;

import java.util.List;

import com.everis.model.FamilyMembers;

public interface FamilyMembersService {
	
	public void save(FamilyMembers familymembers);
	public void update(FamilyMembers familymembers);
	public List findAll();
//	public FamilyMembers findById(Long id);
	public void delete(Long id);
}
