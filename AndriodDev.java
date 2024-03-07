import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AndriodDev extends HttpServlet{
	public void doGet(HttpRequest request, HttpResponse response)throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><body>");
		writer.println("I am an Andriod Developer");
		writer.println("</body></html>");
		
		writer.close();
	}
	
}