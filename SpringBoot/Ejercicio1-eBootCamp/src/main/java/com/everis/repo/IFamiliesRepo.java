package com.everis.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.model.Families;

public interface IFamiliesRepo extends JpaRepository<Families, Long>{

}
