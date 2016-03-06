package com.javatpoint;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class ObjectToXml {
	public static void main(String[] args) throws Exception {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Employee emp1 = new Employee(1, "David", 50000);
		
		marshaller.marshal(emp1, new FileOutputStream("employee.xml"));
		
	}
}
