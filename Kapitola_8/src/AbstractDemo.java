// Jednoducha ukayka abstraktnich trid a metod.
abstract class A9 {
	abstract void callme();
	
	// v abstraktnich tridach je mozne deklarovat i konkretni metody
	
	void callmetoo() {
		System.out.println("Toto je konkretni metoda.");
	}
}

class B9 extends A9 {
	void callme() {
		System.out.println("Implementace abstrakni metody callme v podtride B.");
	}
}

class AbstractDemo {
	public static void main(String[] args) {
		B9 b = new B9();
		
		b.callme();
		b.callmetoo();

	}

}
