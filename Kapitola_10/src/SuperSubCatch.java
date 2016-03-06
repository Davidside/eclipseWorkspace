/* Tento program obsahuje chybu
 * 
 * V rade prikazu catch musi byt prikaz catch pro podtridu
 * uveden pred prikazem catch pro prislusnou nadtridu.
 * Neni-li tomu tak, vysledkem je nedosazitelny kod.
 * V dusledku toho vam kompilator zobrazi chybu.
 */
class SuperSubCatch {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 42 / a;
		}
		
		catch(Exception e) {
			System.out.println("Zachyceni obecne vyjimky.");
		}
		
		/* Tento prikaz catch nebude nikdy proveden, protoze
		 * ArithmeticException je podtridou Exception.
		 */
		
		catch(ArithmeticException e) { // CHYBA - nedosazitelny kod
			System.out.println("Tento prikaz nebude nikdy proveden.");
		}

	}

}
