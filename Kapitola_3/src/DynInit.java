// Ukazka dynamicke inicializace.
class DynInit {

	public static void main(String[] args) {
		double a = 3, b = 4;
		
		// promenna c je inicializovana dynamicky
		double c = Math.sqrt(a * a + b * b);
		
		System.out.println("Delka prepony je " + c);

	}

}
