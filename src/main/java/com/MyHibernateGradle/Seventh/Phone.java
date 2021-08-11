package com.MyHibernateGradle.Seventh;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Std_Phone")
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int phone_id;
	
	@OneToOne(mappedBy = "phone")
	private long phone_no;

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phone(int phone_id, long phone_no) {
		super();
		this.phone_id = phone_id;
		this.phone_no = phone_no;
	}

	public int getPhone_id() {
		return phone_id;
	}

	public void setPhone_id(int phone_id) {
		this.phone_id = phone_id;
	}

	public long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

}
