package org.kodnest.hibernate_ManyToMany_Mapping;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	int empId;
	String empName;
	String empTeam;
	
	@ManyToMany
	List<Technology> technology;
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, String empTeam, List<Technology> technology) {
		this.empId = empId;
		this.empName = empName;
		this.empTeam = empTeam;
		this.technology = technology;
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
	public String getEmpTeam() {
		return empTeam;
	}
	public void setEmpTeam(String empTeam) {
		this.empTeam = empTeam;
	}
	public List<Technology> getTechnology() {
		return technology;
	}
	public void setTechnology(List<Technology> technology) {
		this.technology = technology;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empTeam=" + empTeam + ", technology="
				+ technology + "]";
	}
	
	

}
