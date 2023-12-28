package org.kodnest.hibernate_OneToMany_Mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Product p1=new Product();
    	Product p2=new Product();
    	Product p3=new Product();
    	Product p4=new Product();
    	
    	List<Product> l1=new ArrayList<Product>();
    	l1.add(p1);
    	l1.add(p2);
    	List<Product> l2=new ArrayList<Product>();
    	l1.add(p3);
    	l1.add(p4);
    	
    	Customer c1=new Customer(1,"Guru", 22,l1);
    	Customer c2=new Customer(2,"Suhail", 25,l2);
    	
    	p1.setProductId(11);
    	p1.setProductName("KeyBoard");
    	p1.setProductPrice(1000);
    	p1.setCustomer(c1);
    	
    	p2.setProductId(22);
    	p2.setProductName("Mouse");
    	p2.setProductPrice(700);
    	p2.setCustomer(c1);
    	
    	p3.setProductId(33);
    	p3.setProductName("Tv");
    	p3.setProductPrice(150000);
    	p3.setCustomer(c2);
    	
    	p4.setProductId(44);
    	p4.setProductName("camera");
    	p4.setProductPrice(175000);
    	p4.setCustomer(c2);
    	
    	Configuration con=new Configuration();
    	con.configure();
    	SessionFactory factory=con.buildSessionFactory();
    	Session s=factory.openSession();
    	Transaction txn =s.beginTransaction();
    	
    	s.save(c1);
    	s.save(c2);
    	s.save(p1);
    	s.save(p2);
    	s.save(p3);
    	s.save(p4);
    	txn.commit();
    	System.out.println("Database created ");
    	
    	
    	
    	
    	
    }
}
