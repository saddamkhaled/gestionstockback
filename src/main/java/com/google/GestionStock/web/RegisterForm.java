package com.google.GestionStock.web;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data

public class RegisterForm {

	
private String username;
private String password;
private String repassword;
}
