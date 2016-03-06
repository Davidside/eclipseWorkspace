package ignore;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

// Ignore could be on above the whole class
// @Ignore
public class TestJunit {

	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Ignore
	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		assertEquals(message, messageUtil.printMessage());
	}
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}
}
