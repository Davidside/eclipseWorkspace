// Ukazka vyuziti funkce vicenasobneho catch, ktera je novinkou JDK 7
class MultiCatch {
	public static void main(String[] args) {
		int a=10, b=0;
		int vals[] = { 1, 2, 3 };
		
		try {
			int result = a / b; // vyvolani vyjimky ArithmeticException
			vals[10] = 19; // vyvolani vyjimky ArrayIndexOutOfBoundsException
		}
		// Tato klauzule catch zachytava oba uvedene typy vyjimek.
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Zachycena vyjimka: " + e);
		}
		System.out.println("Po vicenasobnem catch.");
	}

}
