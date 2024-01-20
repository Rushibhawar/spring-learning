package com.hibernate.mapping.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	
	@Id
	private int empId;
	
	@Column(name = "emp_name")
	private String empName;
	
	@ManyToMany
	@JoinTable
	(
		name = "employee_project" ,
		joinColumns = {@JoinColumn(name = "eid", referencedColumnName = "empId")},
		inverseJoinColumns = {@JoinColumn(name = "pid", referencedColumnName = "projectId")}
	)
	private List<Project> project;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int empId, String empName, List<Project> project) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.project = project;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}
	
	
}
