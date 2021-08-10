package com.MyHibernateGradle.Fourth;

import java.io.Closeable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapOneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		MyOneToOne q=new MyOneToOne();
		q.setQuestionId(11);
		q.setQuestions("what is java");
		
		Answer answer=new Answer();
		answer.setAnswerId(22);
		answer.setAnswer("it is a programming lanaguage");
		answer.setQuest(q);
		q.setAnswer(answer);
		
		MyOneToOne q1=new MyOneToOne();
		q1.setQuestionId(111);
		q1.setQuestions("what is abc");
		
		Answer answer1=new Answer();
		answer1.setAnswerId(222);
		answer1.setAnswer("it is an alphabate ");
		answer1.setQuest(q1);
		q1.setAnswer(answer1);
		
		Session s= factory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(q);
		s.save(q1);
		s.save(answer);
		s.save(answer1);
		
		tx.commit();
		
		MyOneToOne myobj= (MyOneToOne) s.get(MyOneToOne.class, 11);
		System.out.println(myobj.getQuestions());
		System.out.println(myobj.getAnswer().getAnswer());
		
		factory.close();
		s.close();
	}

}
