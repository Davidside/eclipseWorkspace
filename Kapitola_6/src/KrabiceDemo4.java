/* Metoda objem() nyni vraci objem krabice
 */
class Krabice4 {
	double sirka;
	double vyska;
	double hloubka;
	
	// Vypocet a vraceni objemu krabice
	double objem() {
		return sirka * vyska * hloubka;
	}
}

class KrabiceDemo4 {

	public static void main(String[] args) {
		Krabice4 mojekrabice1 = new Krabice4();
		Krabice4 mojekrabice2 = new Krabice4();
		double obj;
		
		// prirazeni hodnot promennym instance mojekrabice1
		mojekrabice1.sirka = 10;
		mojekrabice1.vyska = 20;
		mojekrabice1.hloubka = 15;
		
		// prirazeni jinych hodnot promennym instance mojekrabice2
			mojekrabice2.sirka = 3;
			mojekrabice2.vyska = 6;
			mojekrabice2.hloubka = 9;
		
		// nacteni objemu prvni krabice
		obj = mojekrabice1.objem();
		System.out.println("Objem krabice 1 je " + obj);
		
		// nacteni objemu druhe krabice
		obj = mojekrabice2.objem();
		System.out.println("Objem krabice 2 je " + obj);
	}

}
