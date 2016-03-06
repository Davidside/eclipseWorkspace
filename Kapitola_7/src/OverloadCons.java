class Krabice2 {
	double sirka;
	double vyska;
	double hloubka;
	
	// Toto je konstruktor, ktery se pouziva pri zadani vsech tri rozmeru Krabice
	Krabice2 (double w, double h, double d) {
	sirka = w;
	vyska = h;
	hloubka = d;
	}
	
	// Toto je konstruktor, ktery se pouziva bez zadani jakehokoliv rozmeru
		Krabice2 () {
		sirka = -1;		// pouzitim hodnoty -1 budete
		vyska = -1;		// indikovat to, ze se jedna o 
		hloubka = -1;	// neinicializovanou krabici
		}
		
	// Toto je kontruktor, kterz se pouziva pri zadani jednoho rozmeru
		Krabice2 (double len) {
			sirka = vyska = hloubka = len;
		}

	// vypocet a vraceni objemu krabice
	double objem() {
		return sirka * vyska * hloubka;
	}
}

class OverloadCons {
	public static void main(String[] args) {
		// vytvareni objektu tridy Krabice2 pomoci ruznych konstruktoru
		Krabice2 mojekrabice1 = new Krabice2(10, 20, 15);
		Krabice2 mojekrabice2 = new Krabice2();
		Krabice2 mojekrabice3 = new Krabice2(7);
		
		double obj;
		
		// nacteni objemu prvni krabice
		obj = mojekrabice1.objem();
		System.out.println("Objem krabice 1 je: " + obj);

		// nacteni objemu prvni krabice
		obj = mojekrabice2.objem();
		System.out.println("Objem krabice 2 je: " + obj);
				
		// nacteni objemu prvni krabice
		obj = mojekrabice3.objem();
		System.out.println("Objem krabice 3 je: " + obj);
	}

}
