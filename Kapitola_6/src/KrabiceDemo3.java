/* Tento program pridava do tridy Krabice3 metodu/
 */
class Krabice3 {
	double sirka;
	double vyska;
	double hloubka;
	
	// Vypocet a zobrazeni objemu krabice
	void objem() {
		System.out.print("Objem krabice je ");
		System.out.println(sirka * vyska * hloubka);
	}
}

class KrabiceDemo3 {

	public static void main(String[] args) {
		Krabice3 mojekrabice1 = new Krabice3();
		Krabice3 mojekrabice2 = new Krabice3();
		
		// prirazeni hodnot promennym instance mojekrabice1
		mojekrabice1.sirka = 10;
		mojekrabice1.vyska = 20;
		mojekrabice1.hloubka = 15;
		
		// prirazeni jinych hodnot promennym instance mojekrabice2
			mojekrabice2.sirka = 3;
			mojekrabice2.vyska = 6;
			mojekrabice2.hloubka = 9;
		
		// vypocet objemu prvni krabice
		mojekrabice1.objem();
		
		// vypocet objemu druhe krabice
		mojekrabice2.objem();
	}

}
