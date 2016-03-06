package com.example.CheesrStore;

import org.apache.wicket.Application;
import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.request.Request;

public class CheesrSession extends WebSession {
	private Cart cart = new Cart();
	
	protected CheesrSession(Application application, Request request) {
		super(request);
	}
	
	public Cart getCart() {
		return cart;
	}

}
