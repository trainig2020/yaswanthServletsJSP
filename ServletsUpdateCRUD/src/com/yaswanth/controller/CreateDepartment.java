package com.yaswanth.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yaswanth.dto.Department;
import com.yaswanth.service.DepartmentService;

/**
 * Servlet implementation class CreateDepartment
 */
@WebServlet("/CreateDepartment")
public class CreateDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	   //RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//doGet(request, response);
		int deptid = Integer.parseInt(request.getParameter("DeptID"));
		String dname = request.getParameter("DeptName");
		Department department = new Department(deptid, dname);
		DepartmentService.createDepartment(department);
		

		ServletContext servletContext = getServletContext();
		RequestDispatcher requestDispatcher = servletContext
		.getRequestDispatcher("/GetAllDepartments");
		requestDispatcher.forward(request, response);

	}
}
