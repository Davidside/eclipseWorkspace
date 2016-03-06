package DemoDodavka;
// Z tridy KrabiceHmotnost je odvozena trida Dodavka, obsahujici naklady

// Zacneme tridou Krabice.
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

// Pridani hmotnosti
class KrabiceHmotnost extends Krabice {
	double hmotnost; // hmotnost krabice
	
	// Vytvoreni "klonu" objektu
	KrabiceHmotnost (KrabiceHmotnost ob) { // predani objektu konstruktoru
		super(ob);
		hmotnost = ob.hmotnost;
	}
	
	// tento konstruktor se pouziva, jsou-li zadany vsechny ctyri rozmery
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

// Pridani prepravnich nakladu
class Dodavka extends KrabiceHmotnost {
	double naklady;
	
	// Vytvoreni "klonu" objektu
		Dodavka (Dodavka ob) { // predani objektu konstruktoru
			super(ob);
			naklady = ob.naklady;
		}
		
		// tento konstruktor se pouziva, jsou-li zadany vsechny parametry
		Dodavka(double w, double h, double d, double m, double c) {
			super(w, h, d, m); // volani konstruktora nadtridy
			naklady = c;
		}
		
		// vychozi konstruktor
		Dodavka () {
			super();
			naklady = -1;
		}
		
		// Toto je kontruktor, ktery se pouziva pri zadani jednoho rozmeru
		Dodavka (double len, double m, double c) {
			super(len, m);
			naklady = c;
			}
}

class DemoDodavka {
	public static void main(String[] args) {
		Dodavka dodavka1 = new Dodavka(10, 20, 15, 10, 3.41);
		Dodavka dodavka2 = new Dodavka(2, 3, 4, 0.76, 1.28);
		
		double obj;

		obj = dodavka1.objem();
		System.out.println("Objem krabice dodavka1 je: " + obj);
		System.out.println("Hmotnost krabice dodavka1 je " + dodavka1.hmotnost);
		System.out.println("Naklady na prepravu: USD " + dodavka1.naklady);
		System.out.println();

		obj = dodavka2.objem();
		System.out.println("Objem krabice dodavka2 je: " + obj);
		System.out.println("Hmotnost krabice dodavka2 je " + dodavka2.hmotnost);
		System.out.println("Naklady na prepravu: USD " + dodavka2.naklady);
		System.out.println();
		
	}

}
