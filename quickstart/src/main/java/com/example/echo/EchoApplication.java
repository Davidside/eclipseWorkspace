package com.example.echo;

import org.apache.wicket.protocol.http.WebApplication;

public class EchoApplication extends WebApplication {
	public EchoApplication() {
	}
	
	public Class getHomePage() {
		return EchoIndex.class;
	}
}