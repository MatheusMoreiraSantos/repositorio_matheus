import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {
	@Override protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException{
		PrintWriter writer = resp.getWriter();
		writer.print("Meus Projetos Java EE");
	}
	
}
