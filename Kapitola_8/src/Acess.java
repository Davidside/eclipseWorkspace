/* V hierarchii trid plati, ze cleny deklarovane jako private
 * zustavaji i nadale "soukrome" pro jejich tridy.
 * Tento program obsahuje chybu a nebude mozne jej zkompilovat. 
 */

// Vytvoreni nadtridy
class A2 {
	int i; // strandardne verejna (public) promenna
	private int j; // soukroma (private) promenna tridy A
	
	void setij(int x, int y) {
		i = x;
		j = y;
	}
}

// Promenna j tridy A zde neni pristupna
class B2 extends A2 {
	int total;
	
	void sum() {
		total = i + j; // CHYBA, promenna j zde neni pristupna
	}
}

class Acess {
	public static void main(String[] args) {
		B2 subOb = new B2();
		
		subOb.setij(10, 12);
		
		subOb.sum();
		System.out.println("Soucet je " + subOb.total);

	}

}
