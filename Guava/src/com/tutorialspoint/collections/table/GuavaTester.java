package com.tutorialspoint.collections.table;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class GuavaTester {

	public static void main(String[] args) {

		//Table<R,C,V> == Map<R,Map<C,V>>
		/*
		 * 
		 * Company: IBM, Microsoft, TCS
		 * IBM			-> {101:Mahesh, 102:Ramesh, 103:Suresh}
		 * Microsoft	-> {101:Sohan, 102:Mohan, 103:Rohan }
		 * TCS			-> {101:Ram, 102:Shyam, 103:Sunil}
		 */
		
		//create a table
		Table<String, String, String> employeeTable = HashBasedTable.create();
		
		// initialize the table with employee details
		employeeTable.put("IBM", "101", "Mahesh");
		employeeTable.put("IBM", "102", "Ramesh");
		employeeTable.put("IBM", "103", "Suresh");
		
		employeeTable.put("Microsoft", "101", "Sohan");
		employeeTable.put("Microsoft", "102", "Mohan");
		employeeTable.put("Microsoft", "103", "Rohan");
		
		employeeTable.put("TCS", "101", "Ram");
		employeeTable.put("TCS", "102", "Shyam");
		employeeTable.put("TCS", "103", "Sunil");
		
		// get Map corresponding to IBM
		Map<String, String> ibmEmployees = employeeTable.row("IBM");
		
		System.out.println("List of IBM Employees");
		
		for(Map.Entry<String, String> entry : ibmEmployees.entrySet()){
			System.out.println("Emp Id: " + entry.getKey() + ", Name: " + entry.getValue());
		}
		
		//get all the unique keys of the table
		Set<String> employers = employeeTable.rowKeySet();
		System.out.println("Employers: ");
		
		for(String employer : employers){
			System.out.print(employer + " ");
		}
		System.out.println();
		
		//get a Map corresponding to 102
		Map<String, String> employerMap = employeeTable.column("102");
		
		System.out.println("Employees corresponding to number 102");
		for(Map.Entry<String, String> entry : employerMap.entrySet()) {
			System.out.println("Employer: " + entry.getKey() + ", Name: " + entry.getValue());
		}

	}

}
