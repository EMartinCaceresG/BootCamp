package com.everis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.model.Students;
import com.everis.repo.IStudentsRepo;

@Service
public class StudentsServiceImpl implements StudentsService{

	@Autowired
	private IStudentsRepo studentsrepo;
	
	@Override
	public void save(Students students) {
		studentsrepo.save(students);
	}

	@Override
	public void update(Students students) {
		studentsrepo.saveAndFlush(students);
	}

	@Override
	public List findAll() {
		return studentsrepo.findAll();
	}

//	@Override
//	public Students findById(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public void delete(Long id) {
		studentsrepo.deleteById(id);
	}

}
