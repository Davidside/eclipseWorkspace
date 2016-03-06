/* Trida Krabice7 nyni pouziva k inicializaci rozmeru krabice parametrizovany konstruktor.
 */
class Krabice7 {
	double sirka;
	double vyska;
	double hloubka;
	
	// Toto je konstruktor tridy Krabice7
	Krabice7(double w, double h, double d) {
		sirka = w;
		vyska = h;
		hloubka = d;
	}
		
	// Vypocet a vraceni objemu krabice
	double objem() {
		return sirka * vyska * hloubka;
	}
	
}

class KrabiceDemo7 {

	public static void main(String[] args) {
		Krabice7 mojekrabice1 = new Krabice7(10, 20, 15);
		Krabice7 mojekrabice2 = new Krabice7(3, 6, 9);
		double obj;
		
		// nacteni objemu prvni krabice
		obj = mojekrabice1.objem();
		System.out.println("Objem krabice 1 je " + obj);
		
		// nacteni objemu druhe krabice
		obj = mojekrabice2.objem();
		System.out.println("Objem krabice 2 je " + obj);
	}

}
