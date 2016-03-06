package com.wideskills.annotations;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {
	public static SimpleDateFormat dateFormat;
	private Customer customer;
	
	@BeforeClass
	public static void BeforeClass() {
		dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		System.out.println("BeforeClass");
	}
	
	@Before
	public void setUp() throws Exception {
		Date date = dateFormat.parse("1977-03-17");
		customer = new Customer(date, "Smith");
		System.out.println("setUp");
	}
	
	@Test
	public void getName() {
		assertEquals(customer.getName(), "Smith");
		System.out.println("Test getName");
	}
	
	@Test
	public void getAge() {
		assertEquals(customer.getAge(), 40);
		System.out.println("Test getAge");
	}
	
	@After
	public void tearDown() throws Exception {
		customer = null;
		System.out.println("tearDown");
	}
	
	@AfterClass
	public static void AfterClass() {
		dateFormat = null;
		System.out.println("AfterClass");
	}
}
