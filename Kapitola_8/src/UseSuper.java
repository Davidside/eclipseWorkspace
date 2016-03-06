// Pouziti klicoveho slova super k reseni problemu skryvani nazvu.
class A3 {
	int i;
}	
// Vytvoreni podtridy tridy A
class B3 extends A3 {
	int i; // tato promenna i skryva promennou i tridy A
		
	B3(int a, int b) {
		super.i = a; // promenna i tridy A
		i = b; // promenna i tridy B
	}
		
	void show() {
		System.out.println("Hodnota i v nadtride: " + super.i);
		System.out.println("Hodnota i v podtride: " + i);
	}
}
	
class UseSuper {
	public static void main(String[] args) {
		B3 subOb = new B3(1, 2);
		
		subOb.show();

	}

}
