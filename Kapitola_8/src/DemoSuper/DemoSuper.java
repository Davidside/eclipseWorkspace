package DemoSuper;
// Uplna implementace tridy KrabiceHmotnost.
class Krabice {
	double sirka;
	double vyska;
	double hloubka;
	
	// Vytvoreni "klonu" objektu
	Krabice (Krabice ob) { // predani objektu konstruktoru
		sirka = ob.sirka;
		vyska = ob.vyska;
		hloubka = ob.hloubka;
	}
	
	// tento konstruktor se pouziva, jsou-li zadany vsechny tri rozmery
	Krabice (double w, double h, double d) {
		sirka = w;
		vyska = h;
		hloubka = d;
	}
	
	// toto je konstruktor, ktery se pouziva bez zadani jakehokoliv rozmeru
	Krabice () {
		sirka = -1;		// pouzitim hodnoty -1 budete
		vyska = -1;		// indikovat to, ze se jedna o 
		hloubka = -1;	// neinicializovanou krabici
	}
		
	// Toto je kontruktor, ktery se pouziva pri zadani jednoho rozmeru
	Krabice (double len) {
		sirka = vyska = hloubka = len;
	}

	// vypocet a vraceni objemu krabice
	double objem() {
		return sirka * vyska * hloubka;
	}
}

// Trida KrabiceHmotnost nyni plne implementuje vsechny konstruktory
class KrabiceHmotnost extends Krabice {
	double hmotnost; // hmotnost krabice
	
	// Vytvoreni "klonu" objektu
	KrabiceHmotnost (KrabiceHmotnost ob) { // predani objektu konstruktoru
		super(ob);
		hmotnost = ob.hmotnost;
	}
	
	// konstruktor tridy KrabiceHmotnost
	KrabiceHmotnost(double w, double h, double d, double m) {
		super(w, h, d); // volani konstruktora nadtridy
		hmotnost = m;
	}
	// toto je konstruktor, ktery se pouziva bez zadani jakehokoliv rozmeru
	KrabiceHmotnost () {
		super();
		hmotnost = -1;
	}
	
	// Toto je kontruktor, ktery se pouziva pri zadani jednoho rozmeru
		KrabiceHmotnost (double len, double m) {
		super(len);
		hmotnost = m;
		}
}

class DemoSuper {
	public static void main(String[] args) {
		KrabiceHmotnost mojekrabice1 = new KrabiceHmotnost(10, 20, 15, 34.3);
		KrabiceHmotnost mojekrabice2 = new KrabiceHmotnost(2, 3, 4, 0.076);
		KrabiceHmotnost mojekrabice3 = new KrabiceHmotnost(); // vychozi
		KrabiceHmotnost mojekrychle = new KrabiceHmotnost(3, 2);
		KrabiceHmotnost mujklon = new KrabiceHmotnost(mojekrabice1);
		double obj;

		obj = mojekrabice1.objem();
		System.out.println("Objem krabice mojekrabice1 je: " + obj);
		System.out.println("Hmotnost krabice mojekrabice1 je " + mojekrabice1.hmotnost);
		System.out.println();

		obj = mojekrabice2.objem();
		System.out.println("Objem krabice mojekrabice2 je: " + obj);
		System.out.println("Hmotnost krabice mojekrabice2 je " + mojekrabice2.hmotnost);
		System.out.println();
		
		obj = mojekrabice3.objem();
		System.out.println("Objem krabice mojekrabice3 je: " + obj);
		System.out.println("Hmotnost krabice mojekrabice3 je " + mojekrabice3.hmotnost);
		System.out.println();
		
		obj = mujklon.objem();
		System.out.println("Objem krabice mujklon je: " + obj);
		System.out.println("Hmotnost krabice mujklon je " + mujklon.hmotnost);
		System.out.println();
		
		obj = mojekrychle.objem();
		System.out.println("Objem krabice mojekrychle je: " + obj);
		System.out.println("Hmotnost krabice mojekrychle je " + mojekrychle.hmotnost);
		System.out.println();
	}

}
