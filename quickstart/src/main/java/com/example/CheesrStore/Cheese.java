package com.example.CheesrStore;

import java.io.Serializable;

class Cheese implements Serializable {
	private String name;
	private String description;
	private double price;

	Cheese(String name, String description, Double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	
	public double getPrice() {
		return price;
	}
	
}
