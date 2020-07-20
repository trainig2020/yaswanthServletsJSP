package com.yaswanth.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

import com.yaswanth.dto.Department;
import com.yaswanth.service.DepartmentService;

/**
 * Servlet implementation class GetAllDepartments
 */
@WebServlet("/GetAllDepartments")
public class GetAllDepartments extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Department> getalldept = DepartmentService.getAllDepartments();
		for (Department department : getalldept) {
			System.out.println(department.getDeptID()+"----"+department.getDeptName());
		}
		request.setAttribute("getalldept1", getalldept);
		
		HttpSession Session = request.getSession();
		Session.setAttribute("getalldept1", getalldept);
		
		RequestDispatcher dispatcher1 = request.getRequestDispatcher("alldepartments.jsp");
		dispatcher1.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
