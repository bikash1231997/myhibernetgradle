package com.MyHibernateGradle.Eight;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.MyHibernateGradle.Seventh.student;

public class Pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Query q = session.createQuery("from student");
		
		q.setFirstResult(2);
		q.setMaxResults(2);
		
		List<student> list1=q.getResultList();
		
		for (student s : list1) {
			System.out.println(s.getName());
		}
		
		
		session.close();
		factory.close();
	}

}
