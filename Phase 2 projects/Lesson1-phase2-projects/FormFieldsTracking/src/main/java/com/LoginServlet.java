package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
        out.println("<html><body>");
           
        String userId = request.getParameter("userid");
        //creating a new hidden form field
       out.println("<form action='dashboard' method='post'>");
       out.println("<input type='hidden' name='userid' id='userid' value='"+userId+"'>");
       out.println("<input type='submit' value='submit' >");
       out.println("</form>");
       out.println("<script>document.forms[0].submit();</script>");

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
