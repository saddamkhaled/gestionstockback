package com.google.GestionStock.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.google.GestionStock.entities.AppUser;



public interface UserRepository extends JpaRepository<AppUser, Long> {
	public AppUser findByUsername(String username);
	

}
