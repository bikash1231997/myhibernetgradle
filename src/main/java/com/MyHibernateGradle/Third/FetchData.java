package com.MyHibernateGradle.Third;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.MyHibernateGradle.First.student;

public class FetchData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		student std= (student)session.get(student.class, 5);
		
		System.out.println(std.getName()+" "+std.getId());
		
		session.close();
		factory.close();
		
	}

}
