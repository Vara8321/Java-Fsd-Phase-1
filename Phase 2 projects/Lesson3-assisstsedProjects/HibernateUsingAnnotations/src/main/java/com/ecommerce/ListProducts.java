package com.ecommerce;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;



@WebServlet("/listproducts")
public class ListProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
         try {
                SessionFactory factory = HibernateUtil.getSessionFactory();
                
                Session session = factory.openSession();
                // using HQL
                List<EProducts> list = session.createQuery("from EProduct").list();
                
                session.close();
                
                 PrintWriter out = response.getWriter();
                 out.println("<html><body>");
                 out.println("<b>Product Listing</b><br>");
                 for(EProducts p: list) {
                         out.println("ID: " + String.valueOf(p.getID()) + ", Name: " + p.getName() +
                                         ", Price: " + String.valueOf(p.getPrice()) + ", Date Added: " + p.getDateAdded().toString() + "<br>");
                 }
                 
             out.println("</body></html>");
             
             
         } catch (Exception ex) {
                 throw ex;
         }

    

    }
}
