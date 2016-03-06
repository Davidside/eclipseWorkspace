/* Trida Krabice6 nyni pouziva k inicializaci rozmeru krabice konstruktor.
 */
class Krabice6 {
	double sirka;
	double vyska;
	double hloubka;
	
	// Toto je konstruktor tridy Krabice6
	Krabice6() {
		System.out.println("Inicializace Krabice");
		sirka = 10;
		vyska = 10;
		hloubka = 10;
	}
		
	// Vypocet a vraceni objemu krabice
	double objem() {
		return sirka * vyska * hloubka;
	}
	
}

class KrabiceDemo6 {

	public static void main(String[] args) {
		Krabice6 mojekrabice1 = new Krabice6();
		Krabice6 mojekrabice2 = new Krabice6();
		double obj;
		
		// nacteni objemu prvni krabice
		obj = mojekrabice1.objem();
		System.out.println("Objem krabice 1 je " + obj);
		
		// nacteni objemu druhe krabice
		obj = mojekrabice2.objem();
		System.out.println("Objem krabice 2 je " + obj);
	}

}
