package jaxbElementDemo;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;

public class JAXBElementDemo {

	public static void main(String[] args) {
		// Create a student object
		Student student = new Student();
		
		//fill details of the student
		student.setName("Robert");
		student.setId(1);
		student.setAge(12);
		
		try {
			// create JAXBElement of type Student
			// Pass it the student object
			JAXBElement<Student> jaxbElement = new JAXBElement<Student>(new QName(Student.class.getSimpleName()), Student.class, student);
			
			// create a string writer object which will be
			// used to write jaxbElement XML to string
			StringWriter writer = new StringWriter();
			
			// create JAXBContext which will be use to update write
			JAXBContext context = JAXBContext.newInstance(Student.class);
			
			// marshal or convert jaxbElement containing student to xml format
			context.createMarshaller().marshal(jaxbElement, writer);
			
			//print XML string representation of Student object
			System.out.println(writer.toString());
			
			System.out.println();
			
					
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
