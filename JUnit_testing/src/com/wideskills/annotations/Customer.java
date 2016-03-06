package com.wideskills.annotations;

import java.util.Calendar;
import java.util.Date;

public class Customer {
	private Date birthday;
	private String name;
	
	
	public Customer(Date birthday, String name) {
		super();
		this.birthday = birthday;
		this.name = name;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		Calendar cal = Calendar.getInstance();
		int actualYear = cal.get(Calendar.YEAR);
		cal.setTime(birthday);
		int birthdayYear = cal.get(Calendar.YEAR);
		return birthday == null ? 0 : (actualYear - birthdayYear + 1);
	}
}
