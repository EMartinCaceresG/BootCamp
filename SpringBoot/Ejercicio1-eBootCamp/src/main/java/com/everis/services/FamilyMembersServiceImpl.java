package com.everis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.model.FamilyMembers;
import com.everis.repo.IFamilyMembersRepo;

@Service
public class FamilyMembersServiceImpl implements FamilyMembersService {

	@Autowired
	private IFamilyMembersRepo familymembersrepo;
	
	@Override
	public void save(FamilyMembers familymembers) {
		familymembersrepo.save(familymembers);
	}

	@Override
	public void update(FamilyMembers familymembers) {
		familymembersrepo.saveAndFlush(familymembers);		
	}

	@Override
	public List findAll() {
		return familymembersrepo.findAll();
	}

//	@Override
//	public FamilyMembers findById(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public void delete(Long id) {
		familymembersrepo.deleteById(id);
	}

}
