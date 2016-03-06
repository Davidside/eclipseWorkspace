/* Trida NonGen je z funkcniho hlediska ekvivalentem
 * tridy Gen, ale na rozdil od ni nevyuziva genericke typy.
 */

class NonGen {
	Object ob; // ob je nyni typu Object

	// Predani odkazu na objekt typu Object
	// konstruktoru tridy.
	NonGen(Object o) {
		ob = o;
	}
	
	// Vraceni typu Object.
	Object getob() {
		return ob;
	}
	
	// Zobrazeni typu promenne ob.
	void showType() {
		System.out.println("Promenna ob je typu " + ob.getClass().getName());
	}
}

// Ukazka vyuziti negenericke tridy.
class NonGenDemo {
	public static void main(String[] args) {
		NonGen iOb;
		
		// Vytvoreni objektu typu NonGen a ulozeni objektu
		// typu Integer do tohoto objektu.
		// K autoboxingu dochazi i v tomto pripade.
		iOb = new NonGen(88);
		
		// Zobrazeni typu dat, ulozenych do iOb.
		iOb.showType();
		
		// Nacteni hodnoty promenne iOb. Vsimnete si,
		// ze v tomto pripade je nezbytne pretypovani.
		int v = (Integer) iOb.getob();
		System.out.println("hodnota iOb: " + v);
		System.out.println();
		
		// Vytvoreni dalsiho objektu typu NonGen a ulozeni objektu
		// typu String do tohoto objektu.
		NonGen strOb = new NonGen ("Test prace s generickou tridou");
		
		// Zobrazeni typu dat ulozenych do strOb.
		strOb.showType();
		
		// Nacteni hodnoty strOb. 
		// Opet si vsimnete, ze je nutne pretypovani.
		String str = (String )strOb.getob();
		System.out.println("hodnota strOb: " + str);

		// Tento prikaz lze zkompilovat, ale
		// z hlediska koncepcniho je spatny!
		iOb = strOb;
		v = (Integer) iOb.getob(); // behova chyba!
	}

}
