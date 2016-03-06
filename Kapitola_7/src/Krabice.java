class Krabice {
	double sirka;
	double vyska;
	double hloubka;
	
	// Toto je konstruktor tridy Krabice
	Krabice (double w, double h, double d) {
	sirka = w;
	vyska = h;
	hloubka = d;
	}

	// vypocet a vraceni objemu krabice
	double objem() {
		return sirka * vyska * hloubka;
	}
}
