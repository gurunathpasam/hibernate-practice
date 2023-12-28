package com.hibernate.entities;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class App 
{
	public static void main( String[] args )
	{
		
		Bike b1=new Bike(111,"KTM", 980000);
		Bike b2=new Bike(222,"yamaha", 520000);
		Bike b3=new Bike(333,"royal Enfield", 500000);

		Student s1=new Student(1,"guru",98, b3);
		Student s2=new Student(2,"suhail",56, b1);
		Student s3=new Student(3,"ganesh",84, b2);

		Configuration con= new Configuration();
		con.configure();
		SessionFactory factory=con.buildSessionFactory();
		Session s=factory.openSession();
		Transaction txn=s.beginTransaction();
		s.save(s1);
		s.save(s2);
		s.save(s3);
		s.save(b1);
		s.save(b2);
		s.save(b3);
		txn.commit();
		System.out.println("Database created ");

	}
}
