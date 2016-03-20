package parametrized;

public class CarMethod {
	
	public Car getCar(String brand, String color, Integer year) {
		Car car = new Car(brand, color, year);
		
		return car;
	}
}
