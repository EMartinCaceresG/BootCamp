package com.everis.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.model.FamilyMembers;

public interface IFamilyMembersRepo extends JpaRepository<FamilyMembers, Long> {

}
