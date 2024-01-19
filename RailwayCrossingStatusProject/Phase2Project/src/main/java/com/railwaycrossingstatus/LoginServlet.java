package com.railwaycrossingstatus;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// Retrieve the form data
				String email = request.getParameter("email");
				String password = request.getParameter("password");

				// Check if the provided credentials are valid
				UserDAO userDAO = new UserDAO();
				User user = userDAO.getUserByEmail(email);

				if (user != null && user.getPassword().equals(password)) {
					// Authentication successful
					// You can store user details in session for further use
					HttpSession session = request.getSession();
					session.setAttribute("user", user);

					// Redirect to a success page or perform any other necessary actions
					response.sendRedirect("userHome.jsp");
				} else {
					// Authentication failed
					// Redirect to an error page or display an error message
					response.sendRedirect("userRegister.jsp?error=1");
				}
			}
	}

