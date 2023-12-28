package org.kodnest.hibernate_OneToMany_Mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	int productId;
	String productName;
	int productPrice;
	
	@ManyToOne
	Customer customer;
	
	public Product() {
		super();
	}

	public Product(int productId, String productName, int productPrice, Customer customer) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.customer = customer;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", customer=" + customer + "]";
	}
	
	

}
