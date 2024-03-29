package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.entity.EProduct;

@Controller
public class UIController {
	
	// Rest Client
	@Autowired
	RestTemplate restTemplate;
	
	
	@GetMapping("/products")
	public String listProduct(Model model) {
		System.out.println("INSIDE listProduct ");

		EProduct[] products = restTemplate.getForObject("http://localhost/product/list", EProduct[].class);

		model.addAttribute("products", products);

		return "products-list";
	}

}