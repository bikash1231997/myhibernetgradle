package com.MyHibernateGradle.Fifth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapOneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// this is commen for it save the data
		Questions q = new Questions();
		q.setQuestionId(11);
		q.setQuestions("what is java");

		Answernew answer = new Answernew();
		answer.setAnswerId(22);
		answer.setAnswer("it is a programming lanaguage");
		answer.setQuest(q);

		Answernew answer1 = new Answernew();
		answer1.setAnswerId(222);
		answer1.setAnswer("but it was easy");
		answer1.setQuest(q);

		Answernew answer2 = new Answernew();
		answer2.setAnswerId(2222);
		answer2.setAnswer("you should try");
		answer2.setQuest(q);

		List<Answernew> list = new ArrayList<Answernew>();
		list.add(answer);
		list.add(answer1);
		list.add(answer2);
		q.setAnswer(list);

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

		// this is for save
		s.save(q);

		s.save(answer);
		s.save(answer1);
		s.save(answer2);

		// this is for fetch data
		Questions q2 = (Questions) s.get(Questions.class, 11);

		System.out.println(q2.getQuestions());

		for (Answernew a: q2.getAnswer()) {
			System.out.println(a.getAnswer());
		}

		tx.commit();

		factory.close();
		s.close();
	}

}
