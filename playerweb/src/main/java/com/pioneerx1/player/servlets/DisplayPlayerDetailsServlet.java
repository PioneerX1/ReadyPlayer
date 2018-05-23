package com.pioneerx1.player.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.pioneerx1.player.bo.PlayerBO;
import com.pioneerx1.player.dto.Player;

/**
 * Servlet implementation class DisplayPlayerDetailsServlet
 */
public class DisplayPlayerDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// retrieve context, then bo bean from context, then instantiate player object from the bo bean and request parameter of id
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		PlayerBO bo = (PlayerBO) context.getBean("playerbo");
		Player player = bo.findPlayer(Integer.parseInt(request.getParameter("id")));
		
		// output results
		PrintWriter out = response.getWriter();
		out.println("-----Player Details-----");
		out.println("Id: " + player.getId());
		out.println("Name: " + player.getName());
		out.println("Score: " + player.getScore() + " pts.\n");
		
	}

}
