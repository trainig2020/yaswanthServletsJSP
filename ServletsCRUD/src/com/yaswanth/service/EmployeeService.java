package com.yaswanth.service;

import java.util.List;

import com.yaswanth.dao.EmployeeDAO;
import com.yaswanth.dto.Employee;



public class EmployeeService {
	public static String createEmployee(Employee emp) {
    	return new EmployeeDAO().createEmployee(emp);
    }
    public static String updateEmployee(Employee emp) {
    	return new EmployeeDAO().updateEmployee(emp);
    }
    public static String deleteEmployee(Employee emp ) {
    	return new EmployeeDAO().deleteEmployee(emp);
    }
    public static List<Employee> getAllEmployees(int DID){
    	return new EmployeeDAO().getAllEmployees(DID);
    }
}
