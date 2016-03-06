package RawDemo;

// Ukazka pouziti suroveho typu.
class Gen<T> {
	
	T ob; // deklarace objektu typu T
	
	// Predani odkazu na objekt typu T
	// Konstruktoru tridy.
	Gen(T o) {
		ob = o;
	}
	
	// Vraceni objektu ob.
	T getob() {
		return ob;
	}
}

// Prace se surovym typem.
class RawDemo {

	public static void main(String[] args) {
		
		// Vytvoreni objektu typu Gen pro typ Integer.
		Gen<Integer> iOb = new Gen<Integer>(88);
		
		// Vytvoreni objektu typu Gen pro typ String.
		Gen<String> strOb = new Gen<String>("Test generickych typu");
		
		// Vytvoreni suroveho objektu typu Gen a prirazeni
		// hodnoty typu Doble tomuto objektu.
		Gen raw = new Gen(new Double(98.6));
		
		// V tomto pripade je nezbytne pretypovani,
		// protoze typ neni znamy.
		double d = (Double) raw.getob();
		System.out.println("Hodnota: " + d);
		
		// Pouziti surovych typu muze ale vest k behovym chybam.
		// Nize nasleduje nekolik prikladu.
		
		// Nasledujici pretypovani vede k behove chybe!
		// int i = (Integer) raw.getob(); // behova chyba
		
		// Toto prirazeni obchazi typovou bezpecnost.
		strOb = raw; // Kod OK, ale potencialne chybny
		// String str = strOb.getob(); // behova chyba
		
		// Toto prirazeni take obchazi typovou bezpecnost.
		raw = iOb; // Kod OK, ale potencialne chybny
		// d = (Double) raw.getob(); // behova chyba

	}

}
