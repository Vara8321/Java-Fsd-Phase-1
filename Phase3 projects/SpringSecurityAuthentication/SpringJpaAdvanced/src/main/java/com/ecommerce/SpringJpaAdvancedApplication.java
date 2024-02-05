package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.ecommerce.entity","com.ecommerce.repositry","com.ecommerce.controller","com.ecommerce.config"})
@SpringBootApplication
public class SpringJpaAdvancedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaAdvancedApplication.class, args);
	}

}
