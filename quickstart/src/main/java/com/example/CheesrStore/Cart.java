package com.example.CheesrStore;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Cart implements Serializable {
	
	private List<Cheese> cheeses = new ArrayList<Cheese>();
	private Address billingAddress = new Address();

	public List<Cheese> getCheeses() {
		return cheeses;
	}
	public void setCheeses(List<Cheese> other) {
		cheeses = other;
	}
	
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address other) {
		billingAddress = other;
	}
	
	public double getTotal() {
		double total = 0;
		for(Cheese cheese : cheeses) {
			total += cheese.getPrice();
		}
		return total;
	}
	
	public void add(Cheese selected) {
		cheeses.add(selected);
		
	}
	public void remove(Cheese selected) {
		cheeses.remove(selected);
	}
	
	public void saveAddress () {
		String url = "jdbc:mysql://localhost/mojedatabaze?useSSL=false";
		String queryLine = "INSERT INTO address (name, street, zipcode, city, total) VALUES (?, ?, ?, ?, ?)";
		
		String name = getBillingAddress().getName();
		String street = getBillingAddress().getStreet();
		Integer zipcode = getBillingAddress().getZipcode();
		String city = getBillingAddress().getCity();
		Double total = getTotal();
		
		try (Connection conn = DriverManager.getConnection(url, "root", "1234");
		     PreparedStatement query = conn.prepareStatement(queryLine)) {
			query.setString(1, name);
			query.setString(2, street);
			query.setInt(3, zipcode);
			query.setString(4, city);
			query.setDouble(5, total);
			query.executeUpdate();
	        
		}
		catch (SQLException ex) {
	        System.out.println("Chyba při komunikaci s databází");
		}
	}
}
