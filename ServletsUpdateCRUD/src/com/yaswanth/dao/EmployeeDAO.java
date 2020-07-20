package com.yaswanth.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.yaswanth.dto.Employee;
import com.yaswanth.utility.HibernateUtility;

public class EmployeeDAO {
	public String createEmployee(Employee emp) {
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(emp);
		String result = "Employee Details Inserted Successfully";
		session.getTransaction().commit();
		session.close();
		return result;
	}

	public String updateEmployee(Employee emp) {
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(emp);
		String result = "Employee Details Updated Successfully";
		session.getTransaction().commit();
		session.close();
		return result;
		
	}

	public String deleteEmployee(Employee emp) {
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		SQLQuery query= session.createSQLQuery(" delete from Employee where DID=:deptid and EmpID=:empid");
		query.setParameter("deptid", emp.getDID());
		query.setParameter("empid", emp.getEmpID());
		query.executeUpdate();
		String result = "Employee details deleted successfully";
		session.getTransaction().commit();
		session.close();
		return result;
	}

	public List<Employee> getAllEmployees(int dID) {
		Employee e1= new Employee();
		e1.setDID(dID);
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		SQLQuery query= session.createSQLQuery("select * from Employee where DID=:deptid");
	    query.addEntity(Employee.class);
	    query.setParameter("deptid",dID);
	    List Employee=query.list();
	    session.getTransaction().commit();
		session.close();
		return Employee;
	}

}
