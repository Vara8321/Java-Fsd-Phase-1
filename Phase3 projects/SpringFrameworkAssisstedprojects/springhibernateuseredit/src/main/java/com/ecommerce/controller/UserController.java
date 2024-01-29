package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.ecommerce.dao.UserDAO;
import com.ecommerce.entity.UserEntity;

@Controller
public class UserController {

	@Autowired
	UserDAO userDAO;
	
	
	@GetMapping("/listUsers")
	public String listUsers(ModelMap model) {

		List<UserEntity> listOfUsers = userDAO.getAllUsers();

		model.addAttribute("userlist", listOfUsers);

		return "list-of-users"; 

	}
	
}
