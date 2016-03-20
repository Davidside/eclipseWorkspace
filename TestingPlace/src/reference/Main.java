package reference;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.setBrand("Porsche");
		car.setColor("Red");
		
		System.out.println("Instance of a car: " + car);
		
		Car carReference = car;
		
		System.out.println("Reference of a car: " + carReference);
		System.out.println();
		
		carReference.setColor("Blue");
		
		System.out.println("After setting blue color for the reference:");
		System.out.println("Instance of a car: " + car);
		System.out.println("Reference of a car: " + carReference);
		System.out.println();
		
		car.setColor("Green");
		
		System.out.println("After setting green color for the insance car:");
		System.out.println("Instance of a car: " + car);
		System.out.println("Reference of a car: " + carReference);
		System.out.println();
		
		System.out.println("Hashcode of the instance car: " + car.hashCode());
		System.out.println("Hashcode of the car reference: " + carReference.hashCode());
		
		Car carNext = new Car();
		carNext.setBrand("Porsche");
		carNext.setColor("Green");
		System.out.println("Hashcode of the instance carNext: " + carNext.hashCode());
		
	}

}
