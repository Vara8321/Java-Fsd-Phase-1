import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/xyz")
public class FirstGenericExample extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();	
		String userid = request.getParameter("userid");
		String pass = request.getParameter("pass");
		
		out.write("<br>  You submitted userid=<b>"+userid + "</b> and  your password is "+ pass);
		out.close();
	}
	
}
