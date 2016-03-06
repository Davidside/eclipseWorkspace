package com.example.link;

import org.apache.wicket.protocol.http.WebApplication;

public class LinkApplication extends WebApplication {
	public LinkApplication() {
	}
	
	public Class getHomePage() {
		return Index.class;
	}
}