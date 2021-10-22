package com.tcs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestClass {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		User employee1 = new User();
		employee1.setName("Alex");
		employee1.setSalary(45200);
		
		User employee2 = new User();
		employee2.setName("Bruce");
		employee2.setSalary(88200);
		Transaction transaction = session.beginTransaction();
		
		session.save(employee1); 
		session.save(employee2); 
		transaction.commit();
		
		
		session.close();
		factory.close();
		System.out.println("---- Saved Successfully -----");
	}

}
