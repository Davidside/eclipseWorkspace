package Stack;

// Implementace rozhrani IntStack vyuzivajici zasobnik pevne dane velikosti.
class FixedStack implements IntStack {
	private int stck[];
	private int tos;
	
	// Alokace a inicializace zasobniku
	FixedStack(int size) {
		stck = new int[size];
		tos = -1;
	}

	// Pridani  prvku do zasobniku
	public void push(int item) {
		if(tos==stck.length-1) // vyuziti vlastnosti length
			System.out.println("Zasobnik je plny");
		else
			stck[++tos] = item;
	}
	
	// nacteni prvku ze zasobniku
	public int pop() {
		if(tos < 0) {
			System.out.println("Zasobnik je jiz prazdny");
			return 0;
		}
		else
			return stck[tos--];
	}
}

