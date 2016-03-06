package com.wideskills.parametrized;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MyParametrizedTest {
	private int number1;
	private int number2;
	private int expected;
	
	// parameters pass via this constructor
	public MyParametrizedTest(int number1, int number2, int expected) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.expected = expected;
	}
	
	@Parameters(name = "{index}: mean (({0}+{1})/2)={2}")
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] {
			{ 4, 6, 5 },
			{ 2, 2, 2 },
			{ 8, 2, 5 },
			{ 1, 5, 3 }
		};
		return Arrays.asList(data);
	}
	
	@Test
	public void testMean() {
		assertEquals(expected, MyUtils.mean(number1, number2),0.0001);
	}
}
