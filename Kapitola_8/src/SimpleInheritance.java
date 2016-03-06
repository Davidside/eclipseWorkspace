// Jednoduchy priklad dedicnosti.

// Vytvoreni nadtridy
class A {
	int i, j;
	
	void showij() {
		System.out.println("Hodnoty i a j: " + i + " " + j);
	}
}

// Vytvoreni podtridy "rozsirenim" (extend) tridy A.
class B extends A {
	int k;
	
	void showk() {
		System.out.println("Hodnoty k: " + k);
	}
	
	void sum() {
		System.out.println("Soucet i+j+k: " + (i+j+k));
	}
}

class SimpleInheritance {
	public static void main(String args[]) {
		A nadTrida = new A();
		B podTrida = new B();
		
		// Nadtrida muze byt pouzita sama sebou.
		nadTrida.i = 10;
		nadTrida.j = 20;
		System.out.println("Obsah tridy nadTrida: ");
		nadTrida.showij();
		System.out.println();
		
		// Podtrida ma pristup ke vsem verejnym (public) clenum sve nadtridy.
		podTrida.i = 7;
		podTrida.j = 8;
		podTrida.k = 9;
		System.out.println("Obsah tridy podTrida: ");
		podTrida.showij();
		podTrida.showk();
		System.out.println();
		
		System.out.println("Soucet hodnot i, j a k ve tride podTrida: ");
		podTrida.sum();
	}
}
