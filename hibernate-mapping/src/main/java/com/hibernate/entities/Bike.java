package com.hibernate.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {
	@Id
	int regNumber;
	String model;
	int price;
	public Bike() {
		super();
	}
	public Bike(int regNumber, String model, int price) {
		this.regNumber = regNumber;
		this.model = model;
		this.price = price;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bike [regNumber=" + regNumber + ", model=" + model + ", price=" + price + "]";
	}
	
	
	
	

}
