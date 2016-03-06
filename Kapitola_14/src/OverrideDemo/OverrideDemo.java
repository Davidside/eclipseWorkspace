package OverrideDemo;

// Prekryvani genericke metody v genericke tride.
class Gen<T> {
	T ob; // deklarace objektu typu T
	
	// Predani odkazu na objekt typu T
	// konstruktoru tridy.
	Gen(T o) {
		ob = o;
	}
	
	// Vraceni ob.
	T getob() {
		System.out.print("Metoda getob() tridy Gen: ");
		return ob;
	}
}

// Podtrida tridy Gen prekryvajici metodu getob().
class Gen2<T> extends Gen<T> {
	
	Gen2(T o) {
		super(o);
	}
	
	// Prekryti metody getob().
	T getob() {
		System.out.print("Metoda getob() tridy Gen2: ");
		return ob;
	}
}

// Ukazka pouziti prekryte genericke metody.
class OverrideDemo {

	public static void main(String[] args) {
		
		// Vytvoreni objektu tridy Gen pro typ Integer
		Gen<Integer> iOb = new Gen<Integer>(88);
		
		// Vytvoreni objektu tridy Gen2 pro typ Integer
		Gen2<Integer> iOb2 = new Gen2<Integer>(99);
				
		// Vytvoreni objektu tridy Gen2 pro typ String.
		Gen2<String> strOb2 = new Gen2<String>("Test generickych trid");
		
		System.out.println(iOb.getob());
		System.out.println(iOb2.getob());
		System.out.println(strOb2.getob());
		
	}

}
