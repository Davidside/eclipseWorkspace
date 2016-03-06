/* Jednoducha genericka trida.
 * Zde T je typovy parametr, ktery
 * bude nahrazen skutecnym typem ve chvili
 * vyvtvareni objektu typu Gen.
 */

class Gen<T> {
	T ob; // deklarace objektu typu T

	// Predani odkazu na objekt typu T
	// konstruktoru tridy.
	Gen(T o) {
		ob = o;
	}
	
	// Vraceni objektu ob.
	T getob() {
		return ob;
	}
	
	// Zobrazeni typu T.
	void showType() {
		System.out.println("T je typu " + ob.getClass().getName());
	}
}

// Ukazka vyuziti genericke tridy.
class GenDemo {
	public static void main(String[] args) {
		// Vytvoreni odkazu  typu Gen pro cela cisla.
		Gen<Integer> iOb;
		
		// Vytvoreni objektu Gen<Integer> a prirazeni odkazu na tento
		// objekt promenne iOb. Vsimnete si pouziti autoboxingu
		// k zapouzdreni hodnoty 88 do objektu typu Integer.
		iOb = new Gen<Integer>(88);
		
		// Zobrazeni typu dat vyuzivaneho promennou iOb.
		iOb.showType();
		
		// Nacteni hodnoty promenne iOb. Vsimnete si,
		// ze neni potrebne zadne pretypovani.
		int v = iOb.getob();
		System.out.println("hodnota iOb: " + v);
		System.out.println();
		
		// Vytvoreni objektu typu Gen pro typ String.
		Gen<String> strOb = new Gen<String> ("Test prace s generickou tridou");
		
		// Zobrazeni typu dat vyuzivaneho promennou strOb.
		strOb.showType();
		
		// Nacteni hodnoty promenne strOb. Opet si vsimnete toho,
		// ze neni potrebne zadne pretypovani.
		String str = strOb.getob();
		System.out.println("hodnota strOb: " + str);

	}

}
