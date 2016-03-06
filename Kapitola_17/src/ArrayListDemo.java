import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Ukazka pouziti tridy ArrayList.
class ArrayListDemo {

	public static void main(String[] args) {
		// Vytvoreni dynamickeho pole.
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println("Pocatecni velikost pole al: " + al.size());
		
		// Pridani prvku do dynamickeho pole.
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		
		System.out.println("Velikost pole al po pridani prvku: " + al.size());
		
		// Zobrazeni dynamickeho pole
		System.out.println("Obsah pole al: " + al);
		
		// Odstraneni prvku z dynamickeho pole.
		al.remove("F");
		al.remove(2);
		
		System.out.println("Velikost pole al po odstraneni prvku: " + al.size());
		
		System.out.println("Obsah pole al: " + al);
		
		// Serazeni prvku dynamickeho pole podle abecedy
		Collections.sort(al);
		System.out.println("Obsah pole al po serazeni: " + al);
		
		// Vyuziti komparatoru a serazeni prvku v poli sestupne
		Comparator<String> comp = Collections.reverseOrder();
		Collections.sort(al, comp);
		System.out.println("Obsah pole al po serazeni sestupnem: " + al);
		
		// Serazeni prvku v poli  nahodne
		Collections.shuffle(al);
		System.out.println("Obsah pole al po nahodnem prehazeni prvku " + al);

	}

}
