package org.kodnest.hibernate_OneToMany_Mapping;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	int customerId;
	String customerName;
	int customerAge;
	
	@OneToMany
	List<Product> product;

	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName, int customerAge, List<Product> product) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAge = customerAge;
		this.product = product;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAge=" + customerAge
				+ ", product=" + product + "]";
	}
	
	

}
