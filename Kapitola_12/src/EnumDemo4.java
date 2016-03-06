// Ukazka prace s metodami ordinal(), compareTo() a equals().

// Vycet druhu jablek.
enum Jablko4 {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo4 {
	public static void main(String[] args) {
		Jablko4 ap1, ap2, ap3;
		
		// Nacteni vsech ordinalnich hodnot metodou ordinal().
		System.out.println("Nize jsou uvedeny vsechny konstanty vyctu Jablko a jejich ordinalni hodnoty: ");
		for(Jablko4 a : Jablko4.values()) {
			System.out.println(a + " " + a.ordinal());
		}
		
		ap1 = Jablko4.RedDel;
		ap2 = Jablko4.GoldenDel;
		ap3 = Jablko4.RedDel;

		System.out.println();
		
		// Ukazka pouziti metod compareTo a equals()
		if (ap1.compareTo(ap2) < 0) {
			System.out.println(ap1 + " se ve vyctu nachazi pred " + ap2);
		}
		
		if (ap1.compareTo(ap2) > 0) {
			System.out.println(ap2 + " se ve vyctu nachazi pred " + ap1);
		}
		
		if (ap1.compareTo(ap3) == 0) {
			System.out.println(ap1 + " je umistene shodne s " + ap3);
		}
		
		System.out.println();
		
		if(ap1.equals(ap2)) {
			System.out.println("Chyba!");
		}
		
		if(ap1.equals(ap3)) {
			System.out.println(ap1 + " je shodne s " + ap3);
		}
		
		if(ap1 == ap3) {
			System.out.println(ap1 + " == " + ap3);
		}
	}

}
