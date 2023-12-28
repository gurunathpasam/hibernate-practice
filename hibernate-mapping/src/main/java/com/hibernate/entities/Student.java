package com.hibernate.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks, int regNumber) {
		
	}
	@OneToOne
	Bike bike;
	public Student() {
		super();
	}
	
	public Student(int id, String name, int marks, Bike bike) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.bike = bike;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Bike getBike() {
		return bike;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", bike=" + bike + "]";
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	
	

}
