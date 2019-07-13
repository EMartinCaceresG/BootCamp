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

import com.everis.model.FamilyMembers;
import com.everis.services.FamilyMembersService;



@RestController
@RequestMapping("/familymembers")
public class RestFamilyMembersController {

	@Autowired
	private FamilyMembersService familymembersservice;
	
	@GetMapping
	public List getFamilyMembers(){
		return familymembersservice.findAll();
	}
	
	@PostMapping
	public void saveFamilyMembers(@RequestBody FamilyMembers members) {
		familymembersservice.save(members);
	}
	
	@PutMapping
	public void updateFamilyMembers(@RequestBody FamilyMembers members) {
		familymembersservice.update(members);
	}
	
	@DeleteMapping(value="/{id}")
	public void deleteFamilyMembers(@PathVariable Long id) {
		familymembersservice.delete(id);
	}
}
