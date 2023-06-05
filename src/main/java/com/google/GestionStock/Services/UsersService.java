package com.google.GestionStock.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.GestionStock.Repositories.UserRepository;
import com.google.GestionStock.entities.AppUser;
@RestController
public class UsersService {
	@Autowired
	UserRepository userRepository;
	//GET - http://localhost:8080/users
	@GetMapping("/users")
	public List <AppUser> listUsers(){
		return userRepository.findAll()	;}
}
