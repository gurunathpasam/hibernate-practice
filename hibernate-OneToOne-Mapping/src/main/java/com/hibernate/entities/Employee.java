package com.hibernate.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	int empId;
	String empName;
	double empSalary;

	public Employee() {
		super();

	}

	public Employee(int empId, String empName, double empSalary, int depId) {

	}

	@OneToOne
	Department dept;

	public Employee(int empId, String empName, double empSalary, Department dept) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.dept = dept;
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

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", dept=" + dept
				+ "]";
	}

}
