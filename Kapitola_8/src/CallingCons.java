// Tento program ukazuje, kdy jsou konstruktory volany.

// Vytvoreni nadtridy.
class A4 {
	A4() {
		System.out.println("Konstruktor tridy A.");
	}
}

//Vytvoreni podtridy B4 rozsirenim tridy A4
class B4 extends A4
{
	B4() {
		System.out.println("Konstruktor tridy B.");
	}
}

//Vytvoreni dalsi podtridy rozsirenim tridy B4
class C4 extends B4
{
	C4() {
		System.out.println("Konstruktor tridy C.");
	}
}
class CallingCons {
	public static void main(String[] args) {
		C4 c = new C4();

	}

}
