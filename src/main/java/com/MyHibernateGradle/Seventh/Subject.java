package com.MyHibernateGradle.Seventh;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Std_Sub")
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int sub_id;
	
	@ManyToMany(mappedBy = "sub")
	private String subName;

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
