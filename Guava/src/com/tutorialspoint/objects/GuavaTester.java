package com.tutorialspoint.objects;

import com.google.common.base.Objects;

public class GuavaTester {

	public static void main(String[] args) {
		Student s1 = new Student("Mahesh", "Parashar", 1, "VI");
		Student s2 = new Student("Suresh", null, 3, null);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(
				Objects.toStringHelper(s1)
				.add("Name", s1.getFirstName() + " " + s1.getLastName())
				.add("Class", s1.getClassName())
				.add("Roll No", s1.getRollNo())
				.toString());

	}

}
