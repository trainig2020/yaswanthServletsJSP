package com.yaswanth.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.soap.InitParam;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@WebServlet(urlPatterns = {"/xmlServlet"},
    initParams =  @WebInitParam(name = "DefaultValue",value = "YASWANTH")
		)
public class XmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		HttpSession httpSession = request.getSession();
		ServletContext context = request.getServletContext();
		if (userName != "" && userName != null) {
			httpSession.setAttribute("savedusername", userName);
			context.setAttribute("savedusername", userName);
		}
		out.println("Request paramter has username as:" + userName);
		out.println("Session parameter has username as:" + httpSession.getAttribute("savedusername"));
		out.println("context parameter has username as:" + context.getAttribute("savedusername"));
		out.println("init parameter has username as:" + getServletConfig().getInitParameter("DefaultValue"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String prof = request.getParameter("profession");
		// String loc = request.getParameter("location");
		String[] loc = request.getParameterValues("location");
		out.println("Username is " + userName);
		out.println("Password is :" + password);
		out.println("You are :" + prof);
		out.println("you are at " + loc.length + "places");
		for (int i = 0; i < loc.length; i++) {
			out.println(loc[i]);
		}
	}

}
