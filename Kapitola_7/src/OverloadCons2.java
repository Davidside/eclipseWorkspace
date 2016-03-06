// V teto verzi muze byt objekt Krabice3 inicializovan druhym
class Krabice3 {
	double sirka;
	double vyska;
	double hloubka;
	
	// Vsimnete si tohoto konstruktoru. Jeho parametrem je objekt Krabice3.
	Krabice3 (Krabice3 ob) { // predani objektu konstruktoru
	sirka = ob.sirka;
	vyska = ob.vyska;
	hloubka = ob.hloubka;
	}
	
	// Toto je konstruktor, ktery se pouziva pri zadani vsech tri rozmeru
	Krabice3 (double w, double h, double d) {
	sirka = w;
	vyska = h;
	hloubka = d;
	}
	
	// Toto je konstruktor, ktery se pouziva bez zadani jakehokoliv rozmeru
	Krabice3 () {
	sirka = -1;		// pouzitim hodnoty -1 budete
	vyska = -1;		// indikovat to, ze se jedna o 
	hloubka = -1;	// neinicializovanou krabici
	}
		
	// Toto je kontruktor, kterz se pouziva pri zadani jednoho rozmeru
	Krabice3 (double len) {
	sirka = vyska = hloubka = len;
	}

	// vypocet a vraceni objemu krabice
	double objem() {
		return sirka * vyska * hloubka;
	}
}

class OverloadCons2 {
	public static void main(String[] args) {
		
		// vytvareni objektu tridy Krabice3 pomoci ruznych konstruktoru
		Krabice3 mojekrabice1 = new Krabice3(10, 20, 15);
		Krabice3 mojekrabice2 = new Krabice3();
		Krabice3 mojekrabice3 = new Krabice3(7);
		// vytvoreni kopie mojekrabice1
		Krabice3 mujklon = new Krabice3(mojekrabice1);
		
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
		
		// nacteni objemu "klonovane" krabice
		obj = mujklon.objem();
		System.out.println("Objem klonu je: " + obj);
	}

}
