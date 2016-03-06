// Prekryvani metod.
class A6 {
	int i, j;
	A6(int a, int b) {
		i = a;
		j = b;
	}
	
	// zobrazeni hodnoty i a j
	void show() {
		System.out.println("Hodnoty i a j: " + i + " " + j);
	}
}

class B6 extends A6 {
	int k;
	
	B6(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	
	// zobrazeni hodnoty k - tato metoda prekryva metodu show() tridy A5
		void show() {
			super.show();// tento prikaz vola metodu show() nadtridy
			System.out.println("Hodnota k: " + k);
		}
	
}


class OverrideSuper {
	public static void main(String[] args) {
		B6 subOb = new B6(1, 2, 3);
		
		subOb.show(); // tento prikaz vola metodu show() tridy B5

	}

}
