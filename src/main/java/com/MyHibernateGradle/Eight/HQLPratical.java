package com.MyHibernateGradle.Eight;

import java.util.Arrays;
import java.util.List;

//import org.hibernate.Query;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.MyHibernateGradle.Seventh.student;

public class HQLPratical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		//Transaction tx = session.beginTransaction();

		/* Retrive data */
		// String stm ="from student";
		/*
		 * String stm ="from student where name = 'bikash'";
		 * 
		 * Query q=session.createQuery(stm);
		 * 
		 * student r = (student) q.uniqueResult();
		 * System.out.println(" id = "+r.getId());
		 */
		/*
		 * List<student>std= q.list();
		 * 
		 * for(student s : std) { System.out.println(s.getName()); }
		 */
		/* Delete data */

		/*
		 * Query q2 = session.createQuery("delete from student where name='nikash'");
		 * 
		 * 
		 * int r = q2.executeUpdate(); System.out.println("deleted");
		 */

		/*
		 * update
		 */
		/*
		 * Query q2 =
		 * session.createQuery("update from student set name='abc' where name='prakesh'"
		 * );
		 * 
		 * int r = q2.executeUpdate(); System.out.println("updated");
		 */
		
		/*
		 * 
		 * Join Query
		 */

		// Query q2 = session.createQuery("select s.name, a.phone_no from student as s inner join s.phone as a");
		Query q2 = session.createQuery("select s.name, a.subName from student as s inner join s.sub as a");

		List<Object[]> list2 = q2.getResultList();

		for (Object[] s : list2) {
			System.out.println(Arrays.toString(s));
		}

		//tx.commit();
		session.close();
		factory.close();

	}

}
