package com.google.GestionStock.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.google.GestionStock.entities.Product;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
@RepositoryRestResource

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	public List<Product> findByCodeContains(String code);
}
