// Prekryvani metod.
class A5 {
	int i, j;
	A5(int a, int b) {
		i = a;
		j = b;
	}
	
	// zobrazeni hodnoty i a j
	void show() {
		System.out.println("Hodnoty i a j: " + i + " " + j);
	}
}

class B5 extends A5 {
	int k;
	
	B5(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	// zobrazeni hodnoty k - tato metoda prekryva metodu show() tridy A5
		void show() {
			System.out.println("Hodnota k: " + k);
		}
	
}


class Override {
	public static void main(String[] args) {
		B5 subOb = new B5(1, 2, 3);
		
		subOb.show(); // tento prikaz vola metodu show() tridy B5

	}

}
