package com.MyHibernateGradle.Seventh;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		student s1 = new student();
		student s2 = new student();
		student s3 = new student();
		student s4 = new student();
		
		s1.setName("bikash");
		s2.setName("akash");
		s3.setName("nikash");
		s4.setName("prakesh");
		
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		Phone p3 = new Phone();
		Phone p4 = new Phone();
		
		p1.setPhone_no(1234567890);
		p2.setPhone_no(789456123);
		p3.setPhone_no(753159);
		p4.setPhone_no(951357);
		
		s1.setPhone(p1);
		s2.setPhone(p2);
		s3.setPhone(p3);
		s4.setPhone(p4);

		StdAddress add1 = new StdAddress();
		StdAddress add2 = new StdAddress();
		StdAddress add3 = new StdAddress();
		StdAddress add4 = new StdAddress();
		StdAddress add5 = new StdAddress();
		StdAddress add6 = new StdAddress();
		StdAddress add7 = new StdAddress();
		StdAddress add8 = new StdAddress();
		
		add1.setAddLine("house no - 123, lane 2");
		add2.setAddLine("house no - 1234, lane 3");
		add3.setAddLine("house no - 1235, lane 4");
		add4.setAddLine("house no - 1236, lane 5");
		add5.setAddLine("house no - 12356, lane 6");
		add6.setAddLine("house no - 12367, lane 7");
		add7.setAddLine("house no - 123678, lane 8");
		add8.setAddLine("house no - 123679, lane 9");
		
		List<StdAddress> addlist1 = new ArrayList<StdAddress>();
		List<StdAddress> addlist2 = new ArrayList<StdAddress>();
		List<StdAddress> addlist3 = new ArrayList<StdAddress>();
		List<StdAddress> addlist4 = new ArrayList<StdAddress>();
		
		addlist1.add(add1);
		addlist1.add(add2);
		addlist1.add(add3);
		
		addlist2.add(add4);
		addlist2.add(add5);
		addlist2.add(add6);
		
		addlist3.add(add7);
		addlist4.add(add8);
		
		s1.setAdd(addlist1);
		s2.setAdd(addlist2);
		s3.setAdd(addlist3);
		s4.setAdd(addlist4);
		
		Department dpt= new Department();
		
		dpt.setDeptName("physics");
		
		List<student> std1 = new ArrayList<student>();
		std1.add(s1);
		std1.add(s2);
		std1.add(s3);
		std1.add(s4);
		
		dpt.setStds(std1);
		
		s1.setDept(dpt);
		s2.setDept(dpt);
		s3.setDept(dpt);
		s4.setDept(dpt);
		
		Subject sub1= new Subject();
		Subject sub2= new Subject();
		Subject sub3= new Subject();
		Subject sub4= new Subject();
		
		sub1.setSubName("paper1");
		sub2.setSubName("paper2");
		sub3.setSubName("paper3");
		sub4.setSubName("paper4");
		
		List<student> std2 = new ArrayList<student>();
		std2.add(s1);
		std2.add(s2);
		
		List<student> std3 = new ArrayList<student>();
		std3.add(s3);
		std3.add(s4);
		
		List<student> std4 = new ArrayList<student>();
		std4.add(s1);
		std4.add(s4);
		
		List<student> std5 = new ArrayList<student>();
		std1.add(s2);
		std1.add(s3);
		
		sub1.setStudents(std2);
		sub2.setStudents(std3);
		sub3.setStudents(std4);
		sub4.setStudents(std5);
		
		List<Subject> sublist1 = new ArrayList<Subject>();
		sublist1.add(sub1);
		sublist1.add(sub2);
		
		List<Subject> sublist2 = new ArrayList<Subject>();
		sublist2.add(sub3);
		sublist2.add(sub4);
		
		List<Subject> sublist3 = new ArrayList<Subject>();
		sublist1.add(sub1);
		sublist1.add(sub4);
		
		List<Subject> sublist4 = new ArrayList<Subject>();
		sublist2.add(sub2);
		sublist2.add(sub3);
		
		s1.setSub(sublist1);
		s2.setSub(sublist2);
		s3.setSub(sublist3);
		s4.setSub(sublist4);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		
		session.save(add1);
		session.save(add2);
		session.save(add3);
		session.save(add4);
		session.save(add5);
		session.save(add6);
		session.save(add7);
		session.save(add8);
		
		session.save(dpt);
		
		session.save(sub1);
		session.save(sub2);
		session.save(sub3);
		session.save(sub4);
		
		tx.commit();

		factory.close();
		session.close();
		
	}

}
