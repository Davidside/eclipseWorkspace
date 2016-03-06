package Stack;

// Implementace "rostouciho" zasobniku
class DynStack implements IntStack {
	private int stck[];
	private int tos;
	
	// Alokace a inicializace zasobniku
	DynStack(int size) {
		stck = new int[size];
		tos = -1;
	}

	// Pridani  prvku do zasobniku
	public void push(int item) {
		// je-li zasobnik plny, je nutne alokovat vetsi zasobnik
		if(tos==stck.length-1) {
			int temp[] = new int[stck.length * 2]; // zdvojnasobeni velikosti
			for(int i=0; i<stck.length; i++) temp[i] = stck[i];
			stck = temp;
			stck[++tos] = item;
		}
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
