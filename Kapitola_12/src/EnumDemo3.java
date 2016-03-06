// Ukazka pouziti konstruktoru vyctu, promennych instance a metod

// vycet druhu jablek.
enum Jablko3 {
		Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);

	private int cena; // cena kazdeho druhu jablka
	
	// Kontruktor
	Jablko3(int p) {
		cena = p;
	}
	
	// Pretizeny konstruktor
	Jablko3() {
		cena = -1;
	}
	
	int nactiCenu() {
		return cena;
	}
}
	

class EnumDemo3 {

	public static void main(String[] args) {
		Jablko3 ap;

		// Zobrazeni ceny jablka Winesap.
		System.out.println("Jablko Winesap stoji " + 
							Jablko3.Winesap.nactiCenu() + " CZK.\n");
		
		// Zobrazeni vsech druhu jablek a jejich cen.
		System.out.println("Ceny vsech druhu jablek:");
		for(Jablko3 a : Jablko3.values()) {
			System.out.println("Jablko " + a + " stoji " + a.nactiCenu() + " CZK." );
		}
	}
	

}
