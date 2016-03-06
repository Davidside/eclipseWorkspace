import java.util.Comparator;
import java.util.TreeSet;

// Ukazka pouziti vlastniho komparatoru.

// Vytvoreni komparatoru pro retezce umoznujiciho opacne (sestupne) razeni.
class MyComp implements Comparator<String> {
	public int compare(String a, String b) {
		String aStr, bStr;
		aStr = a;
		bStr = b;
		
		// Zajisteni opacneho vysledku porovnani.
		return bStr.compareTo(aStr);
	}
	
	// Prekryti metody equals neni nutne
}	
	
class CompDemo {
	public static void main(String[] args) {
	// Vytvoreni objektu tridy TreeSet.
		TreeSet<String> treeSet = new TreeSet<String>(new MyComp());
		
		// Pridani prvku do nove vytvoreneho objektu.
		treeSet.add("C");
		treeSet.add("A");
		treeSet.add("B");
		treeSet.add("E");
		treeSet.add("F");
		treeSet.add("D");

		// Zobrazeni prvku.
		for(String element : treeSet) {
			System.out.print(element + " ");
		}
		
		System.out.println();
	}

}
