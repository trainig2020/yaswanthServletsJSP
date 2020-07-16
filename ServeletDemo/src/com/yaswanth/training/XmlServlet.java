package com.yaswanth.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		out.println("Hello From GET" +userName);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String  prof = request.getParameter("profession");
		//String loc = request.getParameter("location");
		String [] loc = request.getParameterValues("location");
		out.println("Username is " +userName);
		out.println("Password is :" + password);
		out.println("You are :" + prof);
		out.println("you are at "+ loc.length+"places");
		for(int i=0; i<loc.length; i++) {
			out.println(loc[i]);
		}
		
	}	
}
