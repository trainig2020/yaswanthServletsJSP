package com.yaswanth.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yaswanth.dao.DepartmentDAO;
import com.yaswanth.dto.Department;
import com.yaswanth.service.DepartmentService;


@WebServlet("/UpdateDepartment")
public class UpdateDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateDepartment() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int deptid = Integer.parseInt(request.getParameter("DeptID"));
		String dname = request.getParameter("DeptName");
		Department department = new Department(deptid, dname);
		DepartmentService.updateDepartment(department);
		
		ServletContext servletContext = getServletContext();
		RequestDispatcher requestDispatcher = servletContext
		.getRequestDispatcher("/GetAllDepartments");
		requestDispatcher.forward(request, response);
	}

}
