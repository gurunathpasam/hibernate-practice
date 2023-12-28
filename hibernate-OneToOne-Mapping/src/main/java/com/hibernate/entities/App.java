package com.hibernate.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Department d1 = new Department(1, "ECE");
		Department d2 = new Department(2, "EEE");
		Department d3 = new Department(3, "CIVIL");

		Employee e1 = new Employee(1, "Gurunath", 50000, d2);
		Employee e2 = new Employee(2, "Suhail", 40000, d1);
		Employee e3 = new Employee(3, "Ganesh", 40000, d3);

		Configuration con = new Configuration();
		con.configure();
		SessionFactory s = con.buildSessionFactory();
		Session session = s.openSession();
		Transaction txn = session.beginTransaction();

		session.save(d1);
		session.save(d2);
		session.save(d3);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		txn.commit();
		System.out.println("Database created.........!");

	}

}
