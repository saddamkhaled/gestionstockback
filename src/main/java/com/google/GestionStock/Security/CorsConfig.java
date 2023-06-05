package com.google.GestionStock.Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import java.util.logging.Logger;
@Configuration
public class CorsConfig implements WebMvcConfigurer {
	private static final Logger LOGGER = Logger.getLogger(WebSecurityConfig.class.getName());
	

    @Override
    public void addCorsMappings(CorsRegistry registry) {
    	LOGGER.info("Configuring Cors...");
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
        LOGGER.info("Cors Configured Successfully");
    }
}
