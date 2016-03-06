// Definice vnitrni tridz v ramci smycky for
class Vnejsi3 {
	int outer_x = 100;
	
	void test() {
		for(int i=0; i<10; i++) {
			class Vnitrni3 {
				void display() {
					System.out.println("Zobrazeni: hodnota outer_x = " + outer_x);
				}
			}
			Vnitrni3 inner = new Vnitrni3();
			inner.display();
		}
	}
}

class InnerClassDemo3 {
	public static void main(String[] args) {
		Vnejsi3 outer = new Vnejsi3();
		outer.test();

	}

}
