package HierDemo2;

// Negenericka trida muze byt nadtridou
// genericke podtridy

// Negenericka trida.
class NonGen {
	int num;
	
	NonGen(int i) {
		num = i;
	}
	
	int getnum() {
		return num;
	}
}

// Genericka podtrida
class Gen<T> extends NonGen {
	T ob; // deklarace objektu typu T
	
	// Predani odkazu na objekt typu T
	// konstruktoru tridy.
	Gen(T o, int i) {
		super(i);
		ob = o;
	}
	
	// Vraceni ob.
	T getob() {
		return ob;
	}
}

// Vytvoreni objektu typu Gen.
class HierDemo2 {

	public static void main(String[] args) {
		
		// Vytvoreni objektu tridy Gen pro typ String.
		Gen<String> w = new Gen<String>("Ahoj", 47);
		
		System.out.print(w.getob() + " ");
		System.out.println(w.getnum());

	}

}
