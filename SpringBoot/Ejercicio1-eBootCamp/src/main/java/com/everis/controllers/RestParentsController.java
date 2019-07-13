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

import com.everis.model.Parents;
import com.everis.services.ParentsService;



@RestController
@RequestMapping("/parents")
public class RestParentsController {

	@Autowired
	private ParentsService parentsservice;
	
	@GetMapping
	public List getParents(){
		return parentsservice.findAll();
	}
	
	@PostMapping
	public void saveParents(@RequestBody Parents parents) {
		parentsservice.save(parents);
	}
	
	@PutMapping
	public void updateParents(@RequestBody Parents parents) {
		parentsservice.update(parents);
	}
	
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable Long id) {
		parentsservice.delete(id);
	}
}
