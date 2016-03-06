// Jednoducha genericka trida se dvema
// typovymi parametry: T a V.

class TwoGen<T, V> {
	T ob1;
	V ob2;

	// Predani odkazu na objekt typu T a objekt typu V
	// konstruktoru tridy.
	TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}
	
	// Zobrazeni typu T a V.
	void showTypes() {
		System.out.println("T je typu " + ob1.getClass().getName());
		System.out.println("V je typu " + ob2.getClass().getName());
	}
	
	T getob1() {
		return ob1;
	}
		
	V getob2() {
		return ob2;
	}
}

// Ukazka prace s tridou TwoGen
class SimpGen {
	public static void main(String[] args) {
		
		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Genericke typy");
	
		// Zobrazeni typu
		tgObj.showTypes();
		
		// Nacteni a zobrazeni hodnot.
		int v = tgObj.getob1();
		System.out.println("hodnota ob1: " + v);
		String str = tgObj.getob2();
		System.out.println("hodnota ob2: " + str);

	}

}
