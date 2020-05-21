package pizza_now;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().write("<!DOCTYPE html>" + 
				"<html>" + 
				"  <body>" + 
				"    <h1>Inserisci il tuo ordine!</h1>" + 
				"    <form>" + 
				"      <h3>La tua pizza</h3>" + 
				"      <select name=\"pizza\">" + 
				"        <option value=\"1\">Margherita</option>" + 
				"        <option value=\"1\">Marinara</option>" + 
				"        <option value=\"1\">Tonno e cipolla</option>" + 
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
}
