package com.everis.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.model.Students;

public interface IStudentsRepo extends JpaRepository<Students, Long>{

}
