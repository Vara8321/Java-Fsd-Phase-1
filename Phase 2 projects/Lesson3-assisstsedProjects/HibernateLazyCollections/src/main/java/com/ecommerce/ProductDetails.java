package com.ecommerce;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            
            Session session = factory.openSession();
            
             
            List<EProduct> list = session.createQuery("from EProduct").list();
            
             PrintWriter out = response.getWriter();
             out.println("<html><body>");
             
             out.println("<b>One to One Mapping</b><br>");
             for(EProduct p: list) {
                     out.println("ID: " + String.valueOf(p.getID()) + ", Name: " + p.getName() +
                                     ", Price: " + String.valueOf(p.getPrice()) + ", Date Added: " + p.getDateAdded().toString());
                     PDescription descrip = p.getPdescrip();
                     out.println("<br>Description:" + descrip.getDescrip());
                     out.println("<hr>");
             }                       
             out.println("<b>One to Many and Many to One Mapping</b><br>");
             for(EProduct p: list) {
                     out.println("ID: " + String.valueOf(p.getID()) + ", Name: " + p.getName() +
                                     ", Price: " + String.valueOf(p.getPrice()) + ", Date Added: " + p.getDateAdded().toString());                           
                     List<Color> colors = p.getColors();
                     out.println("<br>Colors: <ul>");
                     for(Color c: colors) {
                             out.print("<li>" + c.getName() + "</li>");
                     }
                     out.println("</ul>");
                     out.println("<hr>");
                     
             }
             out.println("<b>Many to Many Mapping</b><br>");
             for(EProduct p: list) {
                     out.println("ID: " + String.valueOf(p.getID()) + ", Name: " + p.getName() +
                                     ", Price: " + String.valueOf(p.getPrice()) + ", Date Added: " + p.getDateAdded().toString());
                     Set<Finance> finances= p.getFinance();
                     out.println("<br>Finance Options : <ul>");
                     for(Finance f: finances) {
                             out.print("<li>" + f.getFtype() + "</li>");
                     }
                     out.println("</ul>");
                     out.println("<hr>");
             }
             
             
                    session.close();

         out.println("</body></html>");
         
         
     } catch (Exception ex) {
             throw ex;
     }


	

}
