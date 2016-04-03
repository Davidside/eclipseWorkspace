package parametrized;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
	private Integer inputNumber;
	private Boolean expectedResult;
	private PrimeNumberChecker primeNumberChecker;
	
	@Before
	public void initialize() {
		primeNumberChecker = new PrimeNumberChecker();
	}
	
	// Each parameter should be placed as an argument here
	// Every time runner triggers, it will pass the arguments
	// from parameters we define in primeNumbers() method
	public PrimeNumberCheckerTest (Integer inputNumber, Boolean expecetedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expecetedResult;
	}
	
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] {
			{2, true},
			{6, false},
			{22, false},
			{23, true},
			{121, false},
		});
	}
	
	// This test wil run 4 times since we have 5 parametrs define
	@Test
	public void testPrimeNumberChecker() {
		System.out.println("Parametrized Number is : " + inputNumber);
		assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
	}
}
