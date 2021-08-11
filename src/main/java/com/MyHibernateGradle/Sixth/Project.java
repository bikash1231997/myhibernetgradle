package com.MyHibernateGradle.Sixth;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_project")
public class Project {
	@Id
	@Column(name = "proj_id")
	private int projId;

	@Column(name = "project_name")
	private String ProjectName;

	@ManyToMany(mappedBy = "projects")
	private List<Employee> emps;

	public int getProjId() {
		return projId;
	}

	public void setProjId(int projId) {
		this.projId = projId;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	public Project(int projId, String projectName, List<Employee> emps) {
		super();
		this.projId = projId;
		ProjectName = projectName;
		this.emps = emps;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

}
