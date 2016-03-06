import java.util.ArrayList;

// Ukazka prevodu objektu typu ArrayList na pole.
class ArrayListToArray {

	public static void main(String[] args) {
		// Vytvoreni dynamickeho pole.
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		// Pridani prvku do dynamickeho pole.
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		System.out.println("Obsah pole al: " + al);
		
		// Prevod na pole.
		Integer ia[] = new Integer[al.size()];
		ia = al.toArray(ia);
		
		int sum = 0;
		
		// Vypocet souctu prvku, ulozenych v poli.
		for(int i : ia) {
			sum += i;
		}
		System.out.println("Soucet prvku pole je: " + sum);

	}

}
