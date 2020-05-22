package pizza_now;

import java.io.IOException;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getPathInfo().equals("/add")) {
			resp.getWriter().write("<!DOCTYPE html>" + 
					"<html>" + 
					"  <body>" + 
					"    <h1>Inserisci il tuo ordine!</h1>" + 
					"    <form method=\"post\" action=\"/save\">" + 
					"      <h3>La tua pizza</h3>" + 
					"      <select name=\"pizza\">" + 
					"        <option value=\"1\">Margherita</option>" + 
					"        <option value=\"2\">Marinara</option>" + 
					"        <option value=\"3\">Tonno e cipolla</option>" + 
					"      </select><br>" + 
					"      <h3>I tuoi dati</h3>" + 
					"      <input type=\"text\" name=\"fullname\" placeholder=\"Nome e Cognome\" /><br>" + 
					"      <h3>Dove te la portiamo?</h3>" + 
					"      <input type=\"text\" name=\"address\" placeholder=\"Via Allodi 1, Cremona\" /><br><br>" +
					"      <button type=\"submit\">La voglio!</button>" +
					"    </form>" + 
					"  </body>" + 
					"</html>");
		}
		else {
			resp.getWriter().write("<!DOCTYPE html>" + 
					"<html>" + 
					"  <body>" + 
					"    <a href=\"/add\">Nuovo ordine</a>" +
					"    <h1>Tutti gli ordini!</h1>" +
					"    <table>" +
					"    <thead>" +
					"      <tr>" +
					"        <th>Nome</th>" +
					"        <th>Indirizzo</th>" +
					"        <th>Pizza</th>" +
					"      </tr>" +
					"    </thead>");
			
			resp.getWriter().write(Orders.all().stream().map(it -> 
				"<tr>" + 
					"<td>" + it.getFullname() + "</td>" +
					"<td>" + it.getAddress() + "</td>" + 
					"<td>" + it.getPizza() + "</td>" + 
				"</tr>")
				.collect(Collectors.joining())
			);
			
			resp.getWriter().write(
				"    </table>" +
				"  </body>" + 
				"</html>");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Orders.add(req.getParameter("pizza"), req.getParameter("fullname"), req.getParameter("address"));
		resp.sendRedirect("/");
	}
}
