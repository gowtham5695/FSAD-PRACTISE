package com.klu;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class MainApp {
	public static void main(String[] args) {
		//Load configuration & Create the sessionFactory
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		//open session
		Session session=factory.openSession();
		// Begin operation
		Transaction tx=session.beginTransaction();
		// create the table/object
		Student s=new Student("Ravi");
		//save the data/object
		session.save(s);
		
		//commit
		tx.commit();
		//close th connection
		session.close();
		factory.close();
		
		System.out.println("Student data inserted succesfully");		
	}
}
