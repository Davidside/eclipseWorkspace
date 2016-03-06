package com.javatpoint.jaxWSdocument;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.javatpoint.jaxWSdocument.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}
}
