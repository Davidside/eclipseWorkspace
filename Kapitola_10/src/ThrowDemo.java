// Ukazka pouziti prikazu throw.
class ThrowDemo {
	static void demoproc() {
		try {
			throw new NullPointerException("demo");
		}
		
		catch(NullPointerException e) {
			System.out.println("Vyjimka zachycena uvnitr metody demoproc.");
			throw e; // "preposlani vyjimky dale
		}
	}
	
	public static void main(String[] args) {
		try {
			demoproc();
		}
		
		catch(NullPointerException e) {
			System.out.println("Opet zachycena: " + e);
		}
	}
}
