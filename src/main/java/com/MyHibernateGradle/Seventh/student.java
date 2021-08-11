package com.MyHibernateGradle.Seventh;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
public class student {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "std_id")
	private int id;

	@Column(name = "std_name", nullable = false)
	private String name;

	@OneToOne
	private Phone phone;
	
	@OneToMany
	private List<StdAddress> add;
	
	@ManyToOne
	private Department dept;
	
	@ManyToMany
	private List<Subject> sub;

	public student(int id, String name, Phone phone, List<StdAddress> add, Department dept, List<Subject> sub) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.add = add;
		this.dept = dept;
		this.sub = sub;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public List<StdAddress> getAdd() {
		return add;
	}

	public void setAdd(List<StdAddress> add) {
		this.add = add;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public List<Subject> getSub() {
		return sub;
	}

	public void setSub(List<Subject> sub) {
		this.sub = sub;
	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
