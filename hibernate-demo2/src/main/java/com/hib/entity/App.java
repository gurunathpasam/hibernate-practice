package com.hib.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String[] args) {
		Student s1=new Student(1,"guru", 85);
		Student s2=new Student(2,"teju", 90);
		Student s3=new Student(3,"rubb", 80);
		Student s4=new Student(4,"thanishka", 90);
		Cars c1=new Cars(100, "kia", 500000);
		Cars c2=new Cars(101, "Benz", 1500000);
		Cars c3=new Cars(103, "Roadster", 2000000);
		Cars c4=new Cars(104, "Alto", 500000);
		
		//1.Configure the hibernate.cfg.xml
		Configuration con= new Configuration();
		con.configure();
		//2.build sessionFactory using configuration
		SessionFactory factory=con.buildSessionFactory();
		//3.Open Session using sessionFactory
		Session session=factory.openSession();
		//4. Being transaction using session
		Transaction txn=session.beginTransaction();

		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		
		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(c4);
		
		//5.Commit the transaction
		txn.commit();
		System.out.println(s1+"has been Stored in database !");
		System.out.println(s2+"has been Stored in database !");
		System.out.println(s3+"has been Stored in database !");
		System.out.println(s4+"has been Stored in database !");
		
		System.out.println(c1+"has been Stored in database !");
		System.out.println(c2+"has been Stored in database !");
		System.out.println(c3+"has been Stored in database !");
		System.out.println(c4+"has been Stored in database !");



	}

}
