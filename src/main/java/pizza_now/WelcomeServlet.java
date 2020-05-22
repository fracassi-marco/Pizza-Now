package pizza_now;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.rythmengine.Rythm;

public class WelcomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getPathInfo().equals("/add")) {	
			resp.getWriter().write(Rythm.render("add.rtm", Pizzas.all()));
		}
		else {
			resp.getWriter().write(Rythm.render("list.rtm", Orders.all()));
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Orders.add(req.getParameter("pizza"), req.getParameter("fullname"), req.getParameter("address"));
		resp.sendRedirect("/");
	}
}
