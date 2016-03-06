package com.example;

import org.apache.wicket.protocol.http.WebApplication;

public class WicketApplication extends WebApplication {
	public WicketApplication() {
	}
	
	public Class getHomePage() {
		return HomePage.class;
	}
}