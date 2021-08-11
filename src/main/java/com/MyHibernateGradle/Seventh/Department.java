package com.MyHibernateGradle.Seventh;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_Std_Dept")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int dept_id;
	
	private String deptName;

	@OneToMany(mappedBy = "dept")
	private List<student> stds;
	
	public List<student> getStds() {
		return stds;
	}

	public void setStds(List<student> stds) {
		this.stds = stds;
	}

	public Department(int dept_id, String deptName, List<student> stds) {
		super();
		this.dept_id = dept_id;
		this.deptName = deptName;
		this.stds = stds;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int dept_id, String deptName) {
		super();
		this.dept_id = dept_id;
		this.deptName = deptName;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
