package com.google.GestionStock.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.GestionStock.Repositories.ProductRepository;
import com.google.GestionStock.entities.Product;
@RestController
@Service
@Transactional
@CrossOrigin(origins = "http://localhost:4200/") 

public class ProductService {
	
	@Autowired
	private ProductRepository product;

	//GET - http://localhost:8080/products
	@RequestMapping(method=RequestMethod.GET)
	public List<Product> getProducts(){
		return product.findAll();
	}
	
	@GetMapping("/products")
	public List <Product> listTasks(){
		return product.findAll();
	}
	//GET - http://localhost:8080/products/{id}
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Optional<Product> getProductById(@PathVariable Long id){
		return product.findById(id);
	}
	

	//POST - http://localhost:8080/products
	@PostMapping("/products")
	public Product save(@RequestBody Product p) {
		return product.save(p);
	}

	// PUT - http://localhost:8080/products/{id} + RequestBody
	// TODO
	
	@PutMapping("products/{id}")
	public Product updateProduct(@PathVariable Long id, @RequestBody Product p) {
	    p.setId(id);
	    return product.save(p);
	}

	
	
	// DELETE - http://localhost:8080/products/{id}
	@DeleteMapping("/products/{id}")
	public void deleteProduct(@PathVariable Long id) {
	    product.deleteById(id);
	}
	
	
	
	
		
	
	
	/*
	 * 
	 * GET
	 *  @PathVariable ou @requestparam
	 *  http://localhost:8080/products/1 --> @PathVariable
	 *  http://localhost:8080/products?id=1 --> @RequestParams
	 * 
	 */
	
	/*
	 * 
	 * POST
	 *  @BodyRequest
	 *  
	 *  {
	 *   name : "Merit",
	 *   price: 7,
	 *   quantity: 1,
	 *   category : {
	 *   	name: tabac
	 *   }
	 *  }
	 *  
	 * 
	 */
	
	
}
