/* Program vyuzivajici tridu Krabice.
 
 */
class Krabice {
	double sirka;
	double vyska;
	double hloubka;
}

// Tato trida deklaruje objekt typu krabice

class KrabiceDemo {

	public static void main(String[] args) {
		Krabice mojekrabice = new Krabice();
		double objem;
		
		// prirazeni hodnot promennym instance mojekrabice
		mojekrabice.sirka = 10;
		mojekrabice.vyska = 20;
		mojekrabice.hloubka = 15;
		
		// vypocet objemu krabice
		objem = mojekrabice.sirka * mojekrabice.vyska * mojekrabice.hloubka;
		System.out.println("Objem je " + objem);
	}

}
