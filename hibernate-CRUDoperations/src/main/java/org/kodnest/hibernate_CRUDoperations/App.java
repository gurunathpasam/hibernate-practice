package org.kodnest.hibernate_CRUDoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
//		create();
		read();
	
	}

	private static void read() {
		Configuration con= new Configuration().configure();
		SessionFactory factory=con.buildSessionFactory();
		Session session= factory.openSession();
		Transaction txn=session.beginTransaction();
		//To read data from database
		Laptop laptop=session.get(Laptop.class,11);
		Laptop laptop2=session.get(Laptop.class,22);
		txn.commit();
		System.out.println("Data fetched from database ="+laptop);
		System.out.println("Data fetched from database ="+laptop2);
		
	}

	private static void create() {
		Laptop l1=new Laptop(11,"Dell", 50031);
		Laptop l2=new Laptop(22,"HP", 55000);
		Configuration con= new Configuration();
		con.configure();
		SessionFactory factory=con.buildSessionFactory();
		Session s= factory.openSession();
		Transaction txn=s.beginTransaction();
		
		s.save(l1);
		s.save(l2);
		txn.commit();
		System.out.println("Laptop has been created "+ l1);
		System.out.println("Laptop has been created "+ l2);
			
	}
}
