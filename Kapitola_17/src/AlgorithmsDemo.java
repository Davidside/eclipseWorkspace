import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

// Ukazka pouzti ruznych algoritmu tridy Collections.

public class AlgorithmsDemo {
	public static void main(String args[]) {
		
		// Vytvoreni a inicializace spojoveho seznamu.
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		linkedList.add(10);
		linkedList.add(-8);
		linkedList.add(-20);
		linkedList.add(35);
		
		System.out.print("Seznam, po vlozeni: ");
		for(int i : linkedList) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// Zobrazeni obsahu seznamu.
		Collections.sort(linkedList);
		System.out.print("Seznam, serazeny prirozenym razenim: ");
		for(int i : linkedList) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// Vytvoreni komparatoru umoznujiciho opacne razeni.
		Comparator<Integer> reverseComp = Collections.reverseOrder();
		
		// Serazeni seznamu za pomoci tohoto komparatoru.
		Collections.sort(linkedList, reverseComp);
		System.out.print("Seznam, serazeny prirozenym razenim: ");
		for(int i : linkedList) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// Nahodna zmena poradi prvku v seznamu.
		Collections.shuffle(linkedList);
		
		// Zobrazeni seznamu po nahodne zmene poradi.
		System.out.print("Seznam, serazeny prirozenym razenim: ");
		for(int i : linkedList) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.println("Minimum " + Collections.min(linkedList));
		System.out.println("Maximum " + Collections.max(linkedList));
	}
}
