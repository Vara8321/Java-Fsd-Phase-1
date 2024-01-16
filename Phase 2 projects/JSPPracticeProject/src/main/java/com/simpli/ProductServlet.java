package com.simpli;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			int productId = Integer.parseInt(request.getParameter("productId"));
			String productName = request.getParameter("productName");
			String productDescription = request.getParameter("productDescription");
			double productPrice = Double.parseDouble(request.getParameter("productPrice"));
				 // Create a new Product object
			Product product = new Product(productId, productName,productDescription, productPrice);
				 // Store the product in the session
			HttpSession session = request.getSession();
			session.setAttribute("product", product);
				 
			response.sendRedirect("productDisplay.jsp");
		
	}

}
