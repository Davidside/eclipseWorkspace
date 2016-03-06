// Ukazka pouziti vestavenych metod vyctu

// vycet druhu jablek.
enum Jablko {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo2 {

	public static void main(String[] args) {
		Jablko ap;

		System.out.println("Toto jsou vsechny konstanty vyctu Jablko:");
		
		// pouziti metody values()
		Jablko allapples[] = Jablko.values();
		for(Jablko a : allapples) {
			System.out.println(a);
		}
		
		System.out.println();
		
		// pouziti metody valueOf
		ap = Jablko.valueOf("Winesap");
		System.out.println("Promenna ap obsahuje hodnotu " + ap);
	}
	

}
