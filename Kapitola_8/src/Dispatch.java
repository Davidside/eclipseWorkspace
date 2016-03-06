// Pozdni vazba metod
class A8 {
	void callme() {
		System.out.println("Kod metody callme tridy A");
	}
}

class B8 extends A8 {
	// prekryti metody callme()
	void callme() {
		System.out.println("Kod metody callme podtridy B");
	}
}

class C8 extends A8 {
	// prekryti metody callme()
	void callme() {
		System.out.println("Kod metody callme podtridy C");
	}
}

class Dispatch {
	public static void main(String[] args) {
		A8 a = new A8(); // objekt typu A8
		B8 b = new B8(); // objekt typu B8
		C8 c = new C8(); // objekt typu C8
		
		A8 r; // vytvoreni odkazu na typ A8
		
		r = a; // r se odkazuje na objekt typu A8
		r.callme(); // volani metody callme tridy A8
		
		r = b; // r se odkazuje na objekt typu B8
		r.callme(); // volani metody callme tridy B8
		
		r = c; // r se odkazuje na objekt typu C8
		r.callme(); // volani metody callme tridy C8

	}

}
