package easyMock.inJUnit;

import static org.junit.Assert.assertEquals;

import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(EasyMockRunner.class)
public class MathApplicationTester {

	// @TestSubject annotation is used to identify class which is going to use the mock object
	@TestSubject
	MathApplication mathApplication = new MathApplication();
	
	// @Mock annotation is used to create the mock object to be injected
	@Mock
	CalculatorService calculatorService;
	
	// Or can use createMock method instead of annotation @Mock and @TestSubject - I like it more, because I feel it is more readable
	// method createStrictMock takes care of the order of method calls from interface calculatorService (in this case it should be: add, subtract, multiply, divide)
	// method createNiceMock sets default implementation of each method of the mock, so you do not have to use expect method, otherwise it throws AssertionError
//	@Before
//	public void setUp(){
//		mathApplication = new MathApplication();
//		calculatorService = EasyMock.createMock(CalculatorService.class);
//		mathApplication.setCalculatorService(calculatorService);
//	}
	
//	@Test(expected = RuntimeException.class)	// this test should throw Runtime Exception
	@Test
	public void testAdd(){
		// add behavior of calculator service to add two numbers
		EasyMock.expect(calculatorService.add(10.0, 20.0)).andReturn(30.00);
		
		// add the behavior to throw exception
//		EasyMock.expect(calculatorService.add(10.0, 20.0)).andThrow(new RuntimeException("Add operation not implemented"));
	
		// limit the method call to  1, no less and no more calls are allowed
		calculatorService.serviceUsed();
		EasyMock.expectLastCall().times(1);
//		EasyMock.expectLastCall().times(1, 3);
//		EasyMock.expectLastCall().atLeastOnce();
//		EasyMock.expectLastCall().anyTimes();
		
		// activate the mock
		EasyMock.replay(calculatorService);
		
		// test the add functionality
		assertEquals(mathApplication.add(10.0, 20.0), 30.0, 0);
		
		// verify call to calculator service is made or not
		 EasyMock.verify(calculatorService);
		 
		 /*
		  * replayAll() – Registers all the created mocks in one batch.
		  *	verifyAll() – Verifies all the mock operations in one batch.
		  *	resetAll() – Resets all the mock operations in one batch.
		  */
	}
}
