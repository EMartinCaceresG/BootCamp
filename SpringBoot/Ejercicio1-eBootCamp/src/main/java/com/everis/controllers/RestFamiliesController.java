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

import com.everis.model.Families;
import com.everis.services.FamiliesService;



@RestController
@RequestMapping("/families")
public class RestFamiliesController {

	@Autowired
	private FamiliesService familiesservice;
	
	@GetMapping
	public List getFamilies(){
		return familiesservice.findAll();
	}
	
	@PostMapping
	public void saveFamilies(@RequestBody Families families) {
		familiesservice.save(families);
	}
	
	@PutMapping
	public void updateFamilies(@RequestBody Families families) {
		familiesservice.update(families);
	}
	
	@DeleteMapping(value="/{id}")
	public void deleteFamilies	(@PathVariable Long id) {
		familiesservice.delete(id);
	}
}
