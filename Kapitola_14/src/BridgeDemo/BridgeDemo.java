package BridgeDemo;

// Ukazka situace, v niz vznika premostovaci metoda.
class Gen<T> {
	T ob; // deklrace objektu typu T
	
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

// Podtrida tridy Gen
class Gen2 extends Gen<String> {
	
	Gen2(String o) {
		super(o);
	}

	// Prekryti metody getob() specificke pro typ String.
	String getob() {
		System.out.println("Volali jste metodu getob(), specifickou pri String: ");
		return ob;
	}
}

// Nazorna ukazka situace vyzadujici premostovaci metodu.
class BridgeDemo {

	public static void main(String[] args) {
		
		// Vytvoreni objektu tridy Gen2 pro typ String.
		Gen2 strOb2 = new Gen2("Test genericke trid");
		
		System.out.println(strOb2.getob());
		
	}

}
