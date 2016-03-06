package HierDemo;

// Podtrida muze pridavat svoje vlastni typove parametry.
class Gen<T> {
	T ob; // deklarace objektu typu T
	
	// Predani odkazu na objekt typu T
	// konstruktoru tridy.
	Gen(T o) {
		ob = o;
	}
	
	// Vraceni ob.
	T getob() {
		return ob;
	}
}

// Podtrida tridy Gen definujici druhy 
// typovy parametr nazvany V.
class Gen2<T, V> extends Gen<T> {
	V ob2;
	
	Gen2(T o, V o2) {
		super(o);
		ob2 = o2;
	}
	
	V getob2() {
		return ob2;
	}
}

// Vytvoreni objektu typu Gen2.
class HierDemo {

	public static void main(String[] args) {
		
		// Vytvoreni objektu typu Gen2 pro String a Integer
		Gen2<String, Integer> x = new Gen2<String, Integer>("Hodnota je: ", 99);
		
		System.out.print(x.getob());
		System.out.println(x.getob2());

	}

}
