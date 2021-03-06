package jaxbElementDemo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Student {
	private String name;
	private int age;
	private int id;
	
	
	public String getName() {
		return name;
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	/**
	 * @param age set age of the student
	 */
	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	
	@XmlAttribute
	public void setId(int id) {
		this.id = id;
	}
}
