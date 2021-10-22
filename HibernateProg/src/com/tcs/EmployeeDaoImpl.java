package com.tcs;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class EmployeeDaoImpl {

	public int store(User employee) {
		int key = 0;
		SessionFactory factory = HibernateUtil.createSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		key = (int)session.save(employee); // saves & returns the primary key
		transaction.commit();
		session.close();
		factory.close();
		return key;
	}
	
	public User fetchEmployee(int empId) {
		User employee = null;
		SessionFactory factory = HibernateUtil.createSessionFactory();
		Session session = factory.openSession();
		
		employee = session.get(User.class, empId);  // get() method initializes other properties of Employee automatically
		session.close();
		factory.close();
		return employee;
	}
	
	public List<User> fetchEmployees() {
		List<User> employees = null;
		SessionFactory factory = HibernateUtil.createSessionFactory();
		Session session = factory.openSession();
		
		Query<User> query = session.createQuery("select e from User e", User.class);
		employees = query.getResultList();
		session.close();
		factory.close();
		return employees;
	}
	
	
}