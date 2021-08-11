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
@Table(name="Student")
public class student {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "std_id")
	private int id;

	@Column(name = "std_name", nullable = false)
	private String name;

	@OneToOne
	private Phone phone;
	
	@OneToMany(mappedBy = "addLine")
	private List<StdAddress> add;
	
	@ManyToOne
	private Department dept;
	
	@ManyToMany
	private Subject sub;

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
