import java.util.ArrayList;

// Vyuziti for-each verze smycky for pro prochazeni kolekce.
class ForEachDemo {

	public static void main(String[] args) {
		// Vytvoreni dynamickeho pole pro typ Integer.
		ArrayList<Integer> vals = new ArrayList<Integer>();
		
		// Pridani hodnot do dynamickeho pole.
		vals.add(1);
		vals.add(2);
		vals.add(3);
		vals.add(4);
		vals.add(5);
		
		// Vyuziti smycky for k zobrazeni hodnot.
		System.out.print("Puvodni obsah pole vals: ");
		for(int v : vals) {
			System.out.print(v + " ");
		}
		System.out.println();
		
		// Nyni secteme hodnoty jednotlivych prvku v dalsi smycce for.
		int sum = 0;
		for(int v : vals) {
			sum += v;
		}
		System.out.println("Soucet hodnot jednotlivych prvku: " + sum);
		
		// Vyuziti smycky for k zobrazeni hodnot pozpatku.
		System.out.print("Obsah pole vals nacten pozpatku: ");
		for(int v = vals.size()-1; v >= 0; v--) {
			Integer result = vals.get(v);
			
			// Vyuziti smycky for k nahrazeni prvku s hodnotou 3 na 99
			if(result == 3) {
				vals.set(v, 99);
				result = vals.get(v);
			}
			
			System.out.print(result + " ");
			
		}

	}

}
