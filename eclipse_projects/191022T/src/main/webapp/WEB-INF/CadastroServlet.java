import java.io.PrintWriter;
import java.io.Writer;
import java.oi.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name ="cadastro", urlPatterns ="/cadastro") public class CadastroServlet extends HttpServlet{
	@Override protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {	
		
		String livro       = req.getParameter("livro");
		String autor       = req.getParameter("autor");
		String isbn        = req.getParameter("isbn");
		String valor       = req.getParameter("valor");
		String dtcmpr 	   = req.getParameter("dtcmpr");
		PrintWriter writer = resp.getWriter();
		
		writer.print("Dados do Livro:");
		writer.println("Nome: " + livro);
		writer.println("Autor: " + autor);
		writer.println("ISBN: " + isbn);
		writer.println("Valor: " + valor);
		writer.println("Data de Compra: " + dtcmpr);
		
	}
	
}
