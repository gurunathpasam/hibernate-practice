package org.kodnest.hibernate_ManyToMany_Mapping;

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
    	Technology t1=new Technology();
    	Technology t2=new Technology();
    	Technology t3=new Technology();
    	Technology t4=new Technology();
    	
    	List<Technology> tech1=new ArrayList<Technology>();
    	tech1.add(t1);
    	tech1.add(t3);
    	tech1.add(t4);
    	List<Technology> tech2=new ArrayList<Technology>();
    	tech2.add(t2);
    	tech2.add(t3);
    	List<Technology> tech3=new ArrayList<Technology>();
    	tech3.add(t1);
    	tech3.add(t2);
    	tech3.add(t3);
    	List<Technology> tech4=new ArrayList<Technology>();
    	tech4.add(t3);
    	tech4.add(t4);
    	List<Technology> tech5=new ArrayList<Technology>();
    	tech5.add(t1);
    	tech5.add(t2);
    	tech5.add(t3);
    	tech5.add(t4);
    	
    	Employee e1=new Employee(01,"Amit","C",tech1);
    	Employee e2=new Employee(02,"Ankit","B",tech2);
    	Employee e3=new Employee(03,"Akash","A",tech3);
    	Employee e4=new Employee(04,"Ankur","C",tech4);
    	Employee e5=new Employee(05,"Anjali","A",tech5);
    	
    	
    	List<Employee> emp1=new ArrayList<Employee>();
    	emp1.add(e1);
    	emp1.add(e3);
    	emp1.add(e5);
    	List<Employee> emp2=new ArrayList<Employee>();
    	emp2.add(e2);
    	emp2.add(e3);
    	emp2.add(e5);
    	List<Employee> emp3=new ArrayList<Employee>();
    	emp3.add(e1);
    	emp3.add(e2);
    	emp3.add(e3);
    	emp3.add(e4);
    	emp3.add(e5);
    	List<Employee> emp4=new ArrayList<Employee>();
    	emp4.add(e1);
    	emp4.add(e4);
    	emp4.add(e5);
    	
    	t1.setTechId(111);
    	t1.setTechName("java");
    	t1.setEmployee(emp1);
    	
    	t2.setTechId(222);
    	t2.setTechName("Python");
    	t2.setEmployee(emp2);
    	
    	t3.setTechId(333);
    	t3.setTechName("MYSQL");
    	t3.setEmployee(emp3);
    	
    	t4.setTechId(444);
    	t4.setTechName("React");
    	t4.setEmployee(emp4);
    	
    	Configuration con=new Configuration();
    	con.configure();
    	SessionFactory factory=con.buildSessionFactory();
    	Session s= factory.openSession();
    	Transaction txn=s.beginTransaction();
    	s.save(e1);
    	s.save(e2);
    	s.save(e3);
    	s.save(e4);
    	s.save(e5);
    	s.save(t1);
    	s.save(t2);
    	s.save(t3);
    	s.save(t4);
    	txn.commit();
    	
    	System.out.println("Database created...........!");
    	
    	
    		
    	
    }
}
