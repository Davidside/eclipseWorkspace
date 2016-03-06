package com.example.ClockPage;

import org.apache.wicket.protocol.http.WebApplication;

public class ClockApplication extends WebApplication {
	public ClockApplication() {
	}
	
	public Class getHomePage() {
		return ClockPage.class;
	}
}