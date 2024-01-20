package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class Employe {
	private String empName;
	private List<String> empPhone;
	private Set<String> empAddress;
	private Map<String,String> empCourses;
	private Properties empProperties ;
	
	
	
	
	public Employe(String empName, List<String> empPhone, Set<String> empAddress, Map<String, String> empCourses,
			Properties empProperties) {
		super();
		this.empName = empName;
		this.empPhone = empPhone;
		this.empAddress = empAddress;
		this.empCourses = empCourses;
		this.empProperties = empProperties;
	}
	public Properties getEmpProperties() {
		return empProperties;
	}
	public void setEmpProperties(Properties empProperties) {
		this.empProperties = empProperties;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employe(String empName, List<String> empPhone, Set<String> empAddress, Map<String, String> empCourses) {
		super();
		this.empName = empName;
		this.empPhone = empPhone;
		this.empAddress = empAddress;
		this.empCourses = empCourses;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(List<String> empPhone) {
		this.empPhone = empPhone;
	}
	public Set<String> getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(Set<String> empAddress) {
		this.empAddress = empAddress;
	}
	public Map<String, String> getEmpCourses() {
		return empCourses;
	}
	public void setEmpCourses(Map<String, String> empCourses) {
		this.empCourses = empCourses;
	}
	@Override
	public String toString() {
		return "Employe [empName=" + empName + ", empPhone=" + empPhone + ", empAddress=" + empAddress + ", empCourses="
				+ empCourses + ", empProperties=" + empProperties + "]";
	}
	
	
	
}
