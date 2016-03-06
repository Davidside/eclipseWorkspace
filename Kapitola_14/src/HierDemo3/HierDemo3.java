package HierDemo3;

// Pouziti operatoru instanceof v pripade hierarchie generickych trid.
class Gen<T> {
	T ob;
	
	Gen(T o) {
		ob = o;
	}
	
	// Vraceni ob.
	T getob() {
		return ob;
	}
}

// Podtrida tridy Gen
class Gen2<T> extends Gen<T> {
	Gen2(T o) {
		super(o);
	}
}

// Ukazka dusledku typove kompatibility v pripade hierarchie generickych
// trid v dobe behu.
class HierDemo3 {

	public static void main(String[] args) {
		
		// Vytvoreni objektu typu Gen pro typ Integer
		Gen<Integer> iOb = new Gen<Integer>(88);
		
		// Vytvoreni objektu typu Gen2 pro typ Integer
		Gen2<Integer> iOb2 = new Gen2<Integer>(99);
				
		// Vytvoreni objektu typu Gen2 pro typ String.
		Gen2<String> strOb2 = new Gen2<String>("Test generickych trid");
		
		// Zjisteni, zda iOb2 je ci neni nejakou formou tridy Gen2.
		if(iOb2 instanceof Gen2<?>) {
			System.out.println("iOb2 je instanci tridy Gen2");
		}
		
		// Zjisteni, zda iOb2 je ci neni nejakou formou tridy Gen.
		if(iOb2 instanceof Gen<?>) {
			System.out.println("iOb2 je instanci tridy Gen");
		}
		System.out.println();
		
		// Zjisteni, zda strOb2 je ci neni nejakou formou tridy Gen2.
		if(strOb2 instanceof Gen2<?>) {
			System.out.println("strOb2 je instanci tridy Gen2");
		}
		
		// Zjisteni, zda strOb2 je ci neni nejakou formou tridy Gen.
		if(strOb2 instanceof Gen<?>) {
			System.out.println("strOb2 je instanci tridy Gen");
		}
		System.out.println();
		
		// Zjisteni, zda iOb je ci neni instanci tridy Gen2,
		// coz neni.
		if(iOb instanceof Gen2<?>) {
			System.out.println("iOb je instanci tridy Gen2");
		}
		
		// Zjisteni, zda iOb je ci neni instanci tridy Gen,
		// coz je.
		if(iOb instanceof Gen<?>) {
			System.out.println("iOb je instanci tridy Gen");
		}
		
		// Nasledujici prikaz nemuze byt zkompilovan, nebot
		// v dobe behu neexistuje informace o generickem typu.
		//if(iOb2 instanceof Gen2<Integer>)
		// System.out.println("iOb2 je instanci tridy Gen2<Integer>");
	}

}
