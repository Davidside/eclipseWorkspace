// Autoboxing a autounboxing probiha i pri predavani
// argumentu metodam a pri vraceni navratovych hodnot

class AutoBox2 {
	// Prevzeti parametru typu Integer a vraceni hodnoty typu int
	static int m(Integer v) {
		return v; // auto-unboxing na hodnotu typu int
	}
	
	public static void main(String[] args) {
		/* Predani hodnoty typu int metode m() a prirazeni
		 * navratove hodnoty objektu typu Integer. V tomto
		 * pripade je pomoci autoboxingu argument 100 preveden
		 * na objekt typu Integer. Navratova hodnota je 
		 * take pomoci autoboxingu prevedena na objekt typu Integer.
		 */
		
		Integer iOb = m(100);
		
		System.out.println(iOb);

	}

}
