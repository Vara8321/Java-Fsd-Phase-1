package com.railwaycrossingstatus;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/adminLogin")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	 private static final String ADMIN_ID = "Vara@tech.com";
	    private static final String ADMIN_PASSWORD = "12345";

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	    	
	        String email = request.getParameter("email");
	        String password = request.getParameter("password");

	        if (email != null && email.equals(ADMIN_ID) && password != null && password.equals(ADMIN_PASSWORD)) {
	            response.sendRedirect("adminHome.jsp");
	        } else {
	            request.getRequestDispatcher("adminLogin.jsp").forward(request, response);
	        }
	    }
}
