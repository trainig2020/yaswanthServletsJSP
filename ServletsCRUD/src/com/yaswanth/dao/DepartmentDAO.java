package com.yaswanth.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.yaswanth.dto.Department;
import com.yaswanth.utility.HibernateUtility;

public class DepartmentDAO {
	public String createDepartment(Department dept) {
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(dept);
		String result ="Record Inserted Successfully";
		session.getTransaction().commit();
		//session.close();

		return result;
	}

	public String updateDepartment(Department dept) {
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(dept);
		String result ="Record Updated Successfully";
		session.getTransaction().commit();
		session.close();
		return result;
		
	}

	public String deleteDepartment(int deptid) {
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Department d=(Department) session.get(Department.class, deptid);
		session.delete(d);
		session.getTransaction().commit();
		session.close();
		return "result";
	}

	public List<Department> getAllDepartments() {
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Department");
		List Department = query.list();
		for (Object object : Department) {
			System.out.println(object.toString());
		}
//		String Result= "All Department Details Are:";
		session.getTransaction().commit();
		//session.close();
		return Department;
	}

}
