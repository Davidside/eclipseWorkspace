package messageUtil;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {

	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		// message = "New Word"; // this line make the test fail
		assertEquals(message, messageUtil.printMessage());
	}

}
