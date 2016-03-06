
import java.util.LinkedHashSet;

// Ukazka prace s tridou HashSet

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// Vytvoreni hashovaci tabulky
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		
		// Pridani prvku do hashovaci tabulkz
		linkedHashSet.add("B");
		linkedHashSet.add("A");
		linkedHashSet.add("D");
		linkedHashSet.add("E");
		linkedHashSet.add("C");
		linkedHashSet.add("F");
		
		// Oproti tride HashSet zobrazuje LinkedHashSet prvky v tom poradi,
		// v jakem byly vkladany
		System.out.println(linkedHashSet);
		
		// HashCode cele tabulky vraci soucet HashCodu jednotlivych prvku.
		System.out.println("HashCode Hashove tabulky : " + linkedHashSet.hashCode());
		
	}

}
