package com.hib.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Cars")
public class Cars {
	@Id
	int regNumber;
	String model;
	double cost;
	public Cars() {
		super();
		
	}
	public Cars(int regNumber, String model, double cost) {
		this.regNumber = regNumber;
		this.model = model;
		this.cost = cost;
	}
	public int getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Cars [regNumber=" + regNumber + ", model=" + model + ", cost=" + cost + "]";
	}
	

}
