package com.MyHibernateGradle.Seventh;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Std_Add")
public class StdAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int addr_id;
	
	@ManyToOne
	private String addLine;

	public int getAddr_id() {
		return addr_id;
	}

	public void setAddr_id(int addr_id) {
		this.addr_id = addr_id;
	}

	public String getAddLine() {
		return addLine;
	}

	public void setAddLine(String addLine) {
		this.addLine = addLine;
	}

	public StdAddress(int addr_id, String addLine) {
		super();
		this.addr_id = addr_id;
		this.addLine = addLine;
	}

	public StdAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

}
