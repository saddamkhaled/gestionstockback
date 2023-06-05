package com.google.GestionStock.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data @Getter @Setter 
@AllArgsConstructor
@NoArgsConstructor
public class Product  {
	
	@Id @GeneratedValue
	private Long id;
	private String name;
	private double price;
	private double quantity;
	private String code;
	


}
