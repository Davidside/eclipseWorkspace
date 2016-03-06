import java.util.ArrayList;
import java.util.Iterator;

// Kod pochazejici z doby pred uvedenim generickych typu
// a vyuzivajici kolekce.

public class OldStyle {
	public static void main(String args[]) {
		ArrayList list = new ArrayList();
		
		// Tyto radky vkladaji do objektu retezce,
		// ale prakticky mohou vlozit jakykoliv typ.
		// Pred uvedenim generickych typu nemel totiz
		// programator zadnou jednoduchou a pohodlnou
		// moznost omezeni typu objektu ukladanych
		// do kolekce
		list.add("jedna");
		list.add("dve");
		list.add("tri");
		list.add("ctyri");
		// tento prikaz mi kompilator nenahlasi jako chybu
		// muzu totiz do raw listu pridat cokoliv
		// pri pretypovani vsak na String dojde k chybe u
		// smycky while
		// list.add(new Integer(100));
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			// Pro nacteni prvku je nutne explicitni pretypovani,
			// nebot v kolekc jsou ulozeny pouze prvkz typu Object.
			String str = (String) itr.next(); // zde je nutne explicitni pretypovani
			
			System.out.println(str + " ma delku " + str.length() + " znaku.");
		}
	}
}
