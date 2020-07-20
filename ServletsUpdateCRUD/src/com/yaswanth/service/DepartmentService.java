package com.yaswanth.service;

import java.util.List;

import com.yaswanth.dao.DepartmentDAO;
import com.yaswanth.dto.Department;

public class DepartmentService {
	public static String createDepartment(Department dept) { 
	    return new DepartmentDAO().createDepartment(dept);
	  }
	public static String updateDepartment(Department dept) { 
	    return new DepartmentDAO().updateDepartment(dept);
	  }
	public static String deleteDepartment(int deptid) { 
		return new DepartmentDAO().deleteDepartment(deptid);
	  }
	public static List<Department>getAllDepartments() {
		return new DepartmentDAO().getAllDepartments();
	}
	public static Department getDepartment(int deptid) {
		return new DepartmentDAO().getDepartment(deptid);
	}
}
