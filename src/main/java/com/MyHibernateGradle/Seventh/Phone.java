package com.MyHibernateGradle.Seventh;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_Std_Phone")
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int phone_id;
	
	private long phone_no;
	
	@OneToOne(mappedBy = "phone")
	private student stdph;

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phone(int phone_id, long phone_no, student stdph) {
		super();
		this.phone_id = phone_id;
		this.phone_no = phone_no;
		this.stdph = stdph;
	}

	public student getStdph() {
		return stdph;
	}

	public void setStdph(student stdph) {
		this.stdph = stdph;
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
