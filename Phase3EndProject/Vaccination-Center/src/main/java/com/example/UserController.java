package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;
    
   

    @GetMapping("/register")
    public String showRegistrationForm() {
        return "registration";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password) {
        UserEntity user = new UserEntity();
        user.setUsername(username);
        user.setPassword(password); // You should hash this password before saving to the database
        userRepository.save(user);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
    
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, HttpServletRequest request) {
        // Find the user in the database by username
        UserEntity user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            // If user exists and password matches, redirect to welcome page with username as parameter
        	 HttpSession session = request.getSession(true);
             session.setAttribute("username", username);
            return "redirect:/welcome";
        } else {
            // If user does not exist or password does not match, redirect back to login page with error message
            return "redirect:/login?error=true";
        }
    }
    
    @GetMapping("/welcome")
    public String showWelcomePage() {
        return "welcome";
    }
    
    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        // Invalidate session upon logout
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return "log-out";
    }
    
   
}
