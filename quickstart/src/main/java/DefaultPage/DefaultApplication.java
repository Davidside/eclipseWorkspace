package DefaultPage;

import org.apache.wicket.protocol.http.WebApplication;

public class DefaultApplication extends WebApplication {
	public DefaultApplication() {
	}
	
	public Class getHomePage() {
		return DefaultPage.class;
	}
}