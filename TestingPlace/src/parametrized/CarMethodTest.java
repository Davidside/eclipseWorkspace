package parametrized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CarMethodTest {
	private String brand;
	private String color;
	private Integer year;
	private Car expectedCar;
	private CarMethod carMethod;
	
	@Before
	public void setUp() {
		carMethod = new CarMethod();
	}
	
	public CarMethodTest(String brand, String color, Integer year, Car expectedCar) {
		this.brand = brand;
		this.color = color;
		this.year = year;
		this.expectedCar = expectedCar;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> Cars() {
		return Arrays.asList(new Object[][] {
			{"Porsche", "Red", 2000, new Car("Porsche", "Red", 2000)},
			{"Ferrari", "Yellow", 2010, new Car("Ferrari", "Yellow", 2010)},
			{"Lexus", "Blue", 2005,new Car("Lexus", "Blue", 2005)}
		});
	}
	
	@Test
	public void getCarTest() {
		System.out.println("Input brand: " + brand + ", input color: " + color + ", year: " + year + ", car: " + expectedCar);
		assertEquals(expectedCar, carMethod.getCar(brand, color, year));
	}
}
