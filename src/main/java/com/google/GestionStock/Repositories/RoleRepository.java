package com.google.GestionStock.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.google.GestionStock.entities.AppRole;



public interface RoleRepository extends JpaRepository<AppRole, Long> {
public AppRole findByRoleName(String username);
}
