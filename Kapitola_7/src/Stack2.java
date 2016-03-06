// Vylepsena trida Stack, vyuzivajici vlastnost length.
class Stack2 {
	private int stck[];
	private int tos;
	
	// Alokace a inicializace zasobniku
	Stack2(int size) {
		stck = new int[size];
		tos = -1;
	}

	// Pridani noveho prvnku do zasobniku
	void push(int item) {
		if(tos==stck.length-1) // vyuziti vlastnosti length
			System.out.println("Zasobnik je plny");
		else
			stck[++tos] = item;
	}
	
	// Odebrani prvku ze zasobniku
	int pop() {
		if(tos < 0) {
			System.out.println("Zasobnik je jiz prazdny");
			return 0;
		}
		else
			return stck[tos--];
	}
}

