package com.google.GestionStock;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.google.GestionStock.Repositories.AccountService;
import com.google.GestionStock.Repositories.ProductRepository;
import com.google.GestionStock.entities.AppRole;
import com.google.GestionStock.entities.AppUser;
import com.google.GestionStock.entities.Product;

@SpringBootApplication
public class GestionStockApplication implements CommandLineRunner{
	
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	RepositoryRestConfiguration repositoryRestConfiguration;
	@Autowired
	private AccountService accountService;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionStockApplication.class, args);
	}
	@Bean
	public BCryptPasswordEncoder getBCPE() {
		return new BCryptPasswordEncoder();
		}
//	@Bean
//	public CorsFilter corsFilter() {
//		CorsConfiguration corsConfiguration = new CorsConfiguration();
//		corsConfiguration.setAllowCredentials(true);
//		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
//		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Methods","Content-Type",
//				"Accept", "Authorization", "Origin, Accept", "X-Requested-With",
//				"Access-Control-Request-Method", "Access-Control-Request-Headers"));
//		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
//				"Access-Control-Allow-Origin", "Access-Control-Allow-Origin",  "Access-Control-Allow-Methods","Access-Control-Allow-Credentials"));
//		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
//		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
//		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
//		return new CorsFilter(urlBasedCorsConfigurationSource);
//	}
	@Override
	public void run(String... arg0) throws Exception {
//		accountService.saveUser(new AppUser( null, "admin", "123", null));
//		accountService.saveUser(new AppUser(null, "user", "0000", null));
//		accountService.saveRole(new AppRole(null, "ADMIN"));
//		accountService.saveRole(new AppRole(null, "USER"));
//		accountService.addRoleToUser("admin", "ADMIN");
//		accountService.addRoleToUser("admin", "USER");
//		accountService.addRoleToUser("user", "USER");
//		
//
//		
//		
//		Product product1 = new Product(null, "Merite", 7, 4, "223544884");
//		Product product2 = new Product(null,"Marloboro", 8, 6, "Xdl5569");
//
//		productRepository.save(product1);
//		productRepository.save(product2);
		
		
	}
	
}
