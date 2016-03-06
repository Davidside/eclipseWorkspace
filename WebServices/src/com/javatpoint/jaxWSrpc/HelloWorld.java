package com.javatpoint.jaxWSrpc;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//Service Endpoint interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld {
	@WebMethod String getHelloWorldAsString (String name);
}
