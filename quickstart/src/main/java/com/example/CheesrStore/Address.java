package com.example.CheesrStore;

import java.io.Serializable;

class Address implements Serializable {
	private String name;
	private String street;
	private Integer zipcode;
	private String city;
	/*
	public void setName (String name) {
		this.name = name;
	}
	
	public void setStreet (String street) {
		this.street = street;
	}
	
	public void setZipcode (Integer zipcode) {
		this.zipcode = zipcode;
	}
	
	public void setCity (String city) {
		this.city = city;
	}
	*/
	public String getName () {
		return name;
	}
	
	public String getStreet () {
		return street;
	}
	
	public Integer getZipcode () {
		return zipcode;
	}
	public String getCity () {
		return city;
	}
	
}
