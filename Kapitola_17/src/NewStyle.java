import java.util.ArrayList;
import java.util.Iterator;

// Medorni genericka verze.

public class NewStyle {
	public static void main(String args[]) {
		// Nyni lze do dynamickeho pole list ukladat pouze odkazy typu String
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("jedna");
		list.add("dve");
		list.add("tri");
		list.add("ctyri");
		// kompilator u prikazu nize spravne nahlasi chybu
		// jelikost do listu je mozne ukladat pouze String
		// list.add(new Integer(100));
		
		// Vsimnete si ze i iterator je nyni genericky
		Iterator<String> itr = list.iterator();
		
		// Nasledujici prikaz by nyni vedl k chybe v dobe kompilace
		// Iterator<Integer> itr = list.iterator(); // Chyba!
		
		while(itr.hasNext()) {
			String str = itr.next(); // zadne pretypovani neni nutne!
			
			// Nasledujici radek nyni zpusobi chybu jiz v dobe
			// kompilace, a nikoliv az v dobe behu
			// Integer i = itr.next(); // tento prikaz nebude mozne zkompilovat
			System.out.println(str + " ma delku " + str.length() + " znaku.");
		}
	}
}
