package com.MyHibernateGradle.Sixth;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_employee")
public class Employee {
	@Id
	@Column(name = "emp_id")
	private int employeeId;

	private String name;

	@ManyToMany
	@JoinTable (name="emp_proj_join",joinColumns= {@JoinColumn(name = "emp_id")},
	inverseJoinColumns = {@JoinColumn(name = "proj_id")})
	List<Project> projects;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Employee(int employeeId, String name, List<Project> projects) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.projects = projects;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
