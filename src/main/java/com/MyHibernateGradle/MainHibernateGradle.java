package com.MyHibernateGradle;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.MyHibernateGradle.First.student;

public class MainHibernateGradle {

	public static void main(String[] args) throws IOException {
		System.out.println("hi this is java main file");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// System.out.println(factory);
		// System.out.println(factory.isClosed());
		// System.out.println(factory.isOpen());
		// factory.getCurrentSession();

		LocalDateTime nowdate = LocalDateTime.now();
		
		@SuppressWarnings("resource")
		FileInputStream file = new FileInputStream("/home/axelor/backup/2021-04-15.jpg");
		byte[] photos=new byte[file.available()];
		file.read(photos);

		student st = new student();
		//st.setId(10);
		st.setName("bikash");
		st.setCity("bbsr");
		st.setAadhar("789456123123");
		st.setSchool("svm");
		st.setSclass("10th");
		st.setDate(nowdate);
		st.setPhoto(photos);
		//System.out.println(st);
		
		Session session = factory.openSession();

		// session.beginTransaction();
		Transaction tx = session.beginTransaction();

		session.save(st);
		// session.getTransaction().commit();
		tx.commit();
		session.close();
	}

}
