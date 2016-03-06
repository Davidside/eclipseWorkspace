// Metody s odlisnymi signaturami jsou pretizeny - nikoliv prekryty
class A7 {
	int i, j;
	A7(int a, int b) {
		i = a;
		j = b;
	}
	
	// zobrazeni hodnoty i a j
	void show() {
		System.out.println("Hodnoty i a j: " + i + " " + j);
	}
}

class B7 extends A7 {
	int k;
	
	B7(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	
	// pretizeni metody show()
		void show(String msg) {
			System.out.println(msg + k);
		}
	
}


class Override2 {
	public static void main(String[] args) {
		B7 subOb = new B7(1, 2, 3);
		
		subOb.show("Toto je hodnota k: "); // tento prikaz vola metodu show() tridy B7
		subOb.show(); // tento prikaz vola metodu show() tridy A7
	}

}
