import java.util.LinkedList;

// Ukazka pouziti tridy LinkeList.
class LindekListDemo {

	public static void main(String[] args) {
		// Vytvoreni spojoveho seznamu.
		LinkedList<String> ll = new LinkedList<String>();
		
		// Pridani prvku do spojoveho seznamu.
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.addLast("Z");
		ll.addFirst("A");
		ll.add(1, "A2");
		
		System.out.println("Puvodni obsah spojoveho seznamu ll: " + ll);
		
		// Odstraneni prvku ze spojoveho seznamu.
		ll.remove("F");
		ll.remove(2);
		
		System.out.println("Obsah spojoveho seznamu ll po vymazu: " + ll);
		
		// Odstraneni prvniho a posledniho prvku.
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("Spojovy seznam ll po vymazu prvniho a posledniho prvku: " + ll);
		
		// Nacteni a nastaveni hodnoty.
		String val = ll.get(2);
		ll.set(2, val + " zmeneno");
		
		System.out.println("Spojovy seznam ll po zmene: " + ll);
	

	}

}
