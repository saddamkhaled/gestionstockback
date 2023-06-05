package com.google.GestionStock.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.GestionStock.Repositories.AccountService;
import com.google.GestionStock.entities.AppUser;
import com.google.GestionStock.entities.Product;


@RestController

public class AccountRestController {

	@Autowired
	private AccountService accountService;


	
	@PostMapping("/register")
	public AppUser register(@RequestBody RegisterForm userForm) {
		if(!userForm.getPassword().equals(userForm.getRepassword()))
			throw new RuntimeException("You must Confirm your password !");
		AppUser user=accountService.findUserByUsername(userForm.getUsername());
		if(user!=null)
			throw new RuntimeException("this user already exists !");

		AppUser appUser= new AppUser();
		appUser.setUsername(userForm.getUsername());
		appUser.setPassword(userForm.getPassword());
		accountService.saveUser(appUser);
		accountService.addRoleToUser(userForm.getUsername(),"USER");
		return appUser;
		
	}
}