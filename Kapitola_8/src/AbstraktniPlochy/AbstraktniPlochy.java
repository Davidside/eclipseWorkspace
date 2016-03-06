package AbstraktniPlochy;
// Vyuziti abstraktnich metod a trid.
abstract class Utvar {
	double dim1;
	double dim2;
	
	Utvar(double a, double b) {
		dim1 = a;
		dim2 = b;
	}
	
	// metoda plocha je nyni deklarovana jako abstraktni
	abstract double plocha();
}

class Pravouhelnik extends Utvar {
	Pravouhelnik (double a, double b) {
		super(a, b);
	}
	
	// prekryti metody plocha() pro vypocet plochy pravouhelnika
	double plocha() {
		System.out.println("Kod metody pro vypocet plochy pravouhelnika.");
		return dim1 * dim2;
	}
}

class Trojuhelnik extends Utvar {
	Trojuhelnik (double a, double b) {
		super(a, b);
	}
	
	// prekryti metody plocha() pro vypocet plochy trojuhelnika
	double plocha() {
		System.out.println("Kod metody pro vypocet plochy trojuhelnika.");
		return dim1 * dim2 / 2;
	}
}
class AbstraktniPlochy {
	public static void main(String[] args) {
		// Utvar f = new Utvar(10, 10); // toto nyni nelze pouzit
		Pravouhelnik r = new Pravouhelnik(9, 5);
		Trojuhelnik t = new Trojuhelnik(10, 8);
		Utvar figref; // tento prikaz je OK, zadny objekt neexistuje
		
		figref = r;
		System.out.println("Plocha je " + figref.plocha());
		
		figref = t;
		System.out.println("Plocha je " + figref.plocha());
		
	}

}
