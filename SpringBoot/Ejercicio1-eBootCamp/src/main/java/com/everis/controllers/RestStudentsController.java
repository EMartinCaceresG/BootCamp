package com.everis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.model.Students;
import com.everis.repo.IStudentsRepo;
import com.everis.services.StudentsService;



@RestController
@RequestMapping("/students")
public class RestStudentsController {

	@Autowired
	private StudentsService studentsservice;
	
	@GetMapping
	public List getStudents(){
		return studentsservice.findAll();
	}
	
	@PostMapping
	public void saveStudents(@RequestBody Students students) {
		studentsservice.save(students);
	}
	
	@PutMapping
	public void modificar(@RequestBody Students students) {
		studentsservice.update(students);
	}
	
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable ("id") Long id) {
		studentsservice.delete(id);
	}
}
