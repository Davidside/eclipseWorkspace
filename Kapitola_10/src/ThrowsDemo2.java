// Tato verze je jiz spravna a lze ji zkompilovat.
class ThrowsDemo2 {
	static void throwOne() throws IllegalAccessException {
		System.out.println("Uvnitr metody throwOne.");
		throw new IllegalAccessException("demo");
	}
	
	public static void main(String[] args) {
		try {
			throwOne();
		}
		
		catch (IllegalAccessException e) {
			System.out.println("Zachycenaa vyjimka: " + e);
		}
	}

}
