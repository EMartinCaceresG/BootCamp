package com.everis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.model.Parents;
import com.everis.repo.IParentsRepo;

@Service
public class ParentsServiceImpl implements ParentsService {
	
	@Autowired
	private IParentsRepo parentsrepo;
	
	@Override
	public void save(Parents parents) {
		parentsrepo.save(parents);
	}

	@Override
	public void update(Parents parents) {
		parentsrepo.saveAndFlush(parents);
	}

	@Override
	public List findAll() {
		return parentsrepo.findAll();
	}

//	@Override
//	public Parents findById(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public void delete(Long id) {
		parentsrepo.deleteById(id);
	}

}
