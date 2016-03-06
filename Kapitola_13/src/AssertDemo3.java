// Spatne vyuziti prikazu assert!!!
class AssertDemo3 {
	static int val = 3;
	
	// tato metoda vraci cele cislo.
	static int getnum() {
		return val--;
	}
	public static void main(String[] args) {
		int n = 0;
		for(int i=0; i < 10; i++) {
			
			
			assert (n = getnum()) > 0 : "Hodnota n je nula!"; // Toto neni dobry napad!
			
			System.out.println("Hodnota n je " + n);
		}

	}

}
