package com.MyHibernateGradle.Seventh;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int sub_id;

	private String subName;

	@ManyToMany(mappedBy = "sub")
	private List<student> students;


	public Subject(int sub_id, String subName, List<student> students) {
		super();
		this.sub_id = sub_id;
		this.subName = subName;
		this.students = students;
	}

	public List<student> getStudents() {
		return students;
	}

	public void setStudents(List<student> students) {
		this.students = students;
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(int sub_id, String subName) {
		super();
		this.sub_id = sub_id;
		this.subName = subName;
	}

	public int getSub_id() {
		return sub_id;
	}

	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

}
