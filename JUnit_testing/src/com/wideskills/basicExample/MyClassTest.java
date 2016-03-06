package com.wideskills.basicExample;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyClassTest {

	@Test
	public void testAddition() {
		// MyClass is tested
		MyClass tester = new MyClass();
		// Tests
		assertEquals(7, tester.addition(2, 5));
	}
}
