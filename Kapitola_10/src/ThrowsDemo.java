// Tento program obsahuje chybu a neni mozne jej zkompilovat
class ThrowsDemo {
	static void throwOne() {
			System.out.println("Uvnitr metody throwOne.");
			throw new IllegalAccessException("demo");

	}
	
	public static void main(String[] args) {
		throwOne();

	}

}
