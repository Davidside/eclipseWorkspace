/* Tento program pouziva parametrizovanou metodu.
 */
class Krabice5 {
	double sirka;
	double vyska;
	double hloubka;
	
	// Vypocet a vraceni objemu krabice
	double objem() {
		return sirka * vyska * hloubka;
	}
	
	// nastaveni rozmeru krabice
	void nastavRozmery(double w, double h, double d) {
		sirka = w;
		vyska = h;
		hloubka = d;
	}
}

class KrabiceDemo5 {

	public static void main(String[] args) {
		Krabice5 mojekrabice1 = new Krabice5();
		Krabice5 mojekrabice2 = new Krabice5();
		double obj;
		
		// inicializace kazde krabice
		mojekrabice1.nastavRozmery(10, 20, 15);
		mojekrabice2.nastavRozmery(3, 6, 9);
		
		// nacteni objemu prvni krabice
		obj = mojekrabice1.objem();
		System.out.println("Objem krabice 1 je " + obj);
		
		// nacteni objemu druhe krabice
		obj = mojekrabice2.objem();
		System.out.println("Objem krabice 2 je " + obj);
	}

}
