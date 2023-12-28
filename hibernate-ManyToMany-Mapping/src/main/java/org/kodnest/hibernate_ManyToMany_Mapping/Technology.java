package org.kodnest.hibernate_ManyToMany_Mapping;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Technology {
	@Id
	int techId;
	String techName;
	public Technology() {
		super();
	}@ManyToMany
	List<Employee> employee;
	public Technology(int techId, String techName, List<Employee> employee) {
		this.techId = techId;
		this.techName = techName;
		this.employee = employee;
	}
	public int getTechId() {
		return techId;
	}
	public void setTechId(int techId) {
		this.techId = techId;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Technology [techId=" + techId + ", techName=" + techName + ", employee=" + employee + "]";
	}
	
	

}
