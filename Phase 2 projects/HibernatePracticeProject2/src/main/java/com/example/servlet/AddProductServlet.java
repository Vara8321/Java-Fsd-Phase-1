package com.example.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.example.model.Product;

//@WebServlet("/addProduct")
public class AddProductServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private SessionFactory sessionFactory;
	
	@Override
	public void init() throws ServletException {
	Configuration configuration = new Configuration().configure();
	sessionFactory = configuration.buildSessionFactory();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		double price = Double.parseDouble(request.getParameter("price"));
		Product product = new Product();
		product.setName(name);
		product.setDescription(description);
		product.setPrice(price);
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			session. save ( product );
			transaction.commit();
			response.sendRedirect("success.jsp"); 
		} catch (Exception e) {
			if (transaction != null) {
			transaction.rollback();
		}
		response.sendRedirect("error.jsp"); 
		
		} finally {
			session.close();
			}
		}
	
	@Override
	public void destroy() {
		sessionFactory.close();
	}
}
