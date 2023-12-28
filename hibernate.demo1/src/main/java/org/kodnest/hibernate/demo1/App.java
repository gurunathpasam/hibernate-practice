package org.kodnest.hibernate.demo1;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
    	Configuration conf= new Configuration();
    	conf.configure();
    	
    	SessionFactory factory =conf.buildSessionFactory();
    	System.out.println("Hibernate started working successfully -- "+ factory.toString());
    }
}
