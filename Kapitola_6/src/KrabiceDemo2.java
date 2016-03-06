/* Tento program deklaruje dva objekty krabice.
 */
class Krabice2 {
	double sirka;
	double vyska;
	double hloubka;
}

class KrabiceDemo2 {

	public static void main(String[] args) {
		Krabice2 mojekrabice1 = new Krabice2();
		Krabice2 mojekrabice2 = new Krabice2();
		double objem;
		
		// prirazeni hodnot promennym instance mojekrabice1
		mojekrabice1.sirka = 10;
		mojekrabice1.vyska = 20;
		mojekrabice1.hloubka = 15;
		
		// prirazeni jinych hodnot promennym instance mojekrabice2
			mojekrabice2.sirka = 3;
			mojekrabice2.vyska = 6;
			mojekrabice2.hloubka = 9;
		
		// vypocet objemu prvni krabice
		objem = mojekrabice1.sirka * mojekrabice1.vyska * mojekrabice1.hloubka;
		System.out.println("Objem je " + objem);
		
		// vypocet objemu druhe krabice
		objem = mojekrabice2.sirka * mojekrabice2.vyska * mojekrabice2.hloubka;
		System.out.println("Objem je " + objem);
	}

}
