
import java.util.LinkedHashSet;
import java.util.TreeSet;

// Ukazka prace s tridou HashSet

public class TreeSetDemo {

	public static void main(String[] args) {
		// Vytvoreni instance tridy TreeSet pro String
		TreeSet<String> treeSet = new TreeSet<String>();
		
		// Pridani prvku do teto instance
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("D");
		treeSet.add("E");
		treeSet.add("C");
		treeSet.add("F");

		System.out.println(treeSet);
		
		// Vypsani podretezce od C vcetne do F vyjma
		System.out.println(treeSet.subSet("C", "F"));

		
		// Vytvoreni instance tridy TreeSet pro Integer
		TreeSet<Integer> intTreeSet = new TreeSet<Integer>();
		
		// Pridani prvku do teto instance
		intTreeSet.add(50);
		intTreeSet.add(65);
		intTreeSet.add(-20);
		intTreeSet.add(5);
		intTreeSet.add(12);
		intTreeSet.add(-3);

		System.out.println(intTreeSet);
		
	}

}
