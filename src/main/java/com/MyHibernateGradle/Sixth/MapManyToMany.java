package com.MyHibernateGradle.Sixth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Employee e1= new Employee();
		Employee e2= new Employee();
		
		e1.setEmployeeId(23);
		e1.setName("abc");
		
		e2.setEmployeeId(25);
		e2.setName("abcd");
		
		Project p1=new Project();
		Project p2=new Project();
		
		p1.setProjId(12);
		p1.setProjectName("libyary");
		
		p2.setProjId(122);
		p2.setProjectName("libyary2");
		
		List<Employee> list1= new ArrayList<Employee>();
		List<Project> list2= new ArrayList<Project>();
		
		list1.add(e1);
		list1.add(e2);
		
		list2.add(p1);
		list2.add(p2);
		
		e1.setProjects(list2);
		p2.setEmps(list1);
		
		Session s= factory.openSession();
		Transaction tx=s.beginTransaction();
		
		s.save(e1);
		s.save(e2);
		s.save(p1);
		s.save(p2);
		
		tx.commit();
		s.close();
		factory.close();
	}

}
