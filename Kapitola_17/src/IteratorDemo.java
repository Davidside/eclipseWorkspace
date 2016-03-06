import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// Ukazka prace s iteratory
class IteratorDemo {

	public static void main(String[] args) {
		// Vytvoreni dynamickeho pole.
		ArrayList<String> al = new ArrayList<String>();
		
		// Pridani prvku do dynamickeho pole.
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		
		// Pouziti iteratoru pro zobrazeni obsahu pole al.
		System.out.print("Puvodni obsah pole al: ");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		
		// Upravy objektu nacitanych pomoci iteratoru.
		ListIterator<String> litr = al.listIterator();
		while(litr.hasNext()) {
			String element = litr.next();
			litr.set(element + "+");
		}
		System.out.print("Upraveny obsah pole al: ");
		itr = al.iterator();
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		
		// Nyni nasleduje zobrazeni obsahu pole pozpatku.
		System.out.print("Upraveny obsah pole a1 pozpatku: ");
		while(litr.hasPrevious()) {
			String element = litr.previous();
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
