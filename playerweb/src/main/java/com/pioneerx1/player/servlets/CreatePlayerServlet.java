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
 * Servlet implementation class CreatePlayerServlet
 */
public class CreatePlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// pull out the player properties from http request
		Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		Integer score = Integer.parseInt(request.getParameter("score"));
		
		// create the player
		Player player = new Player();
		player.setId(id);
		player.setName(name);
		player.setScore(score);
		
		// retrieve context and access to all beans
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		PlayerBO bo = (PlayerBO) context.getBean("playerbo");
		bo.create(player);
		
		// confirm player creation
		PrintWriter out = response.getWriter();
		out.println("Player created!");
		
	}

}
