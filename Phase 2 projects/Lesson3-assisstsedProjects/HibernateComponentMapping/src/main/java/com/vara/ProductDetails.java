package com.vara;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;



import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/details")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	SessionFactory sessionFactory = null;

	@Override
	public void init(ServletConfig config) throws ServletException {

		super.init(config);
		// Get the SessionFactory object and the Session object
		sessionFactory = HibernateUtil.getSessionFactory();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        try {
            
        	 PrintWriter out = response.getWriter();
             out.println("<html><body>");
        	
        	
            Session session = sessionFactory.openSession();
            
             
            List<EProduct> list = session.createQuery("from EProduct").list();
            
          
             out.println("<b>Component Mapping</b><br>");
             for(EProduct p: list) {
                     out.println("ID: " + String.valueOf(p.getID()) + ", Name: " + p.getName() +
                                     ", Price: " + String.valueOf(p.getPrice()) + ", Date Added: " + p.getDateAdded().toString());
                     ProductParts parts = p.getParts();
                     out.println("Parts =" + parts.getCpu() + ", " + parts.getHdd() + ", " + parts.getRam());
                     out.println("<hr>");
             }
             
                    session.close();

         out.println("</body></html>");
         out.close();         
         
     } catch (Exception ex) {
             throw ex;
     }

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
