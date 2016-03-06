package Stack;

/* Vztvoreni referencni promenne rozhrani
 * a pristup kzasobnikum prodnictvim teto promenne
 */

class IFTest3 {

	public static void main(String[] args) {
		IntStack mystack; // vytvoreni referencni promenne rozhrani
		DynStack ds = new DynStack(5);
		FixedStack fs = new FixedStack(8);
		
		mystack = ds; // prirazeni dynamickeho zasobniku
		// pridani nejakych hodnot do zasobniku
		for(int i=0; i<12; i++) mystack.push(i);
		
		mystack = fs; // prirazeni zasobniku o pevne velikosti
		// pridani nejakych hodnot do zasobniku
		for(int i=0; i<8; i++) mystack.push(i);
		
		mystack = ds;
		System.out.println("Hodnoty v dynamickem zasobniku:");
		for(int i=0; i<12; i++)
			System.out.println(mystack.pop());
		
		mystack = fs;
		System.out.println("Hodnoty v zasobniku o pevne velikosti:");
		for(int i=0; i<8; i++)
			System.out.println(mystack.pop());

	}

}
