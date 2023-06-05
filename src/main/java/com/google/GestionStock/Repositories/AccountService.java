package com.google.GestionStock.Repositories;

import com.google.GestionStock.entities.AppRole;
import com.google.GestionStock.entities.AppUser;

public interface AccountService  {
	public AppUser saveUser (AppUser user);
	public AppRole saveRole(AppRole role);
	public void addRoleToUser(String username , String roleName);
	public AppUser findUserByUsername(String username);
}
