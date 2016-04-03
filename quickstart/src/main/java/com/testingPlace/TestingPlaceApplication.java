package com.testingPlace;

import org.apache.wicket.protocol.http.WebApplication;

public class TestingPlaceApplication extends WebApplication {
	public TestingPlaceApplication() {
	}
	
	public Class getHomePage() {
		return TestingPlacePage.class;
	}
}