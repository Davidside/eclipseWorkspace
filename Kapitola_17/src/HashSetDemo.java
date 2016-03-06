import java.util.HashSet;

// Ukazka prace s tridou HashSet

public class HashSetDemo {

	public static void main(String[] args) {
		// Vytvoreni hashovaci tabulky
		HashSet<String> hashSet = new HashSet<String>();
		
		// Pridani prvku do hashovaci tabulkz
		hashSet.add("B");
		hashSet.add("A");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("C");
		hashSet.add("F");
		
		// Pridani stejneho prvku do HashSety, tedy do rozhrani Set,
		// nevlozi tento stejny prvky do pole dvakrat, respektive
		// nejspis prepise stary prvek za novy
		
		hashSet.add("F");
		
		// Prvky v HashSetu nesou razeny
		System.out.println(hashSet);
		
		// HashCode cele tabulky vraci soucet HashCodu jednotlivych prvku.
		System.out.println("HashCode Hashove tabulky : " + hashSet.hashCode());
		
		// Zkouska HashSetu s Integer
		HashSet<Integer> intHashSet = new HashSet<Integer>();
		
		// Pridani prvku do hashovaci tabulkz
		intHashSet.add(5);
		intHashSet.add(6);
		intHashSet.add(12);
		intHashSet.add(50);
		intHashSet.add(3);
		intHashSet.add(-5);
		
		System.out.println(intHashSet);
		
		System.out.print("Vycet prvku hashSetu po pouziti smycky for-each: ");
		for(String x : hashSet) {
			System.out.print(x + " ");
		}
		System.out.println();
		
	}

}
