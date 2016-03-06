package slovnicek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Slovnicek {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/mojedatabaze?useSSL=false";
		String query = "INSERT INTO address (jmeno, ulice, zipcode, mesto) VALUES (?, ?, ?, ?)";
		
		String name = "test jmena";
		String street = "test ulice";
		Integer zipcode = 200;
		String city = "test mesta";
	
			try (Connection spojeni = DriverManager.getConnection(url, "root", "1234");
			        PreparedStatement dotaz = spojeni.prepareStatement(query);) {
			        dotaz.setString(1, name);
			        dotaz.setString(2, street);
			        dotaz.setInt(3, zipcode);
			        dotaz.setString(4, city);
			        dotaz.executeUpdate();
			     
			} catch (SQLException ex) {
			        System.out.println("Chyba pøi komunikaci s databází");
			}
		
	}
}
