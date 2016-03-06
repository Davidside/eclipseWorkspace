package com.javatpoint;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class XmlToObject {

	public static void main(String[] args) {
		try {
			File file = new File("employee.xml");
			
			JAXBContext context = JAXBContext.newInstance(Employee.class);
			
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Employee emp1 = (Employee) unmarshaller.unmarshal(file);
			System.out.println(emp1.getId() + " " + emp1.getName() + " " + emp1.getSalary());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
