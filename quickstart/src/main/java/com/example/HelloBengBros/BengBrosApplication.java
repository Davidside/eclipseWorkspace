package com.example.HelloBengBros;

import org.apache.wicket.protocol.http.WebApplication;

public class BengBrosApplication extends WebApplication {
	public BengBrosApplication() {
	}
	
	public Class getHomePage() {
		return HelloBengBros.class;
	}
}