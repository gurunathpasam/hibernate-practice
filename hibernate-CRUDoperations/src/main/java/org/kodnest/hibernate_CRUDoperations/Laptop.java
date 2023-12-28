package org.kodnest.hibernate_CRUDoperations;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	@Id
	int id;
	String brandName;
	int cost;
	public Laptop() {
		super();
	}
	public Laptop(int id, String brandName, int cost) {
		this.id = id;
		this.brandName = brandName;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brandName=" + brandName + ", cost=" + cost + "]";
	}
	

}
