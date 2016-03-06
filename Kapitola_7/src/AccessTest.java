/* Tento program demonstruje rozdily mezi
 * modifikatory pristupu public a private.
 */

class Test5 {
	int a; // vychozi ci standartni pristup
	public int b; // pristup public
	private int c; // pristup private
	
	// metody pro pristup k promenne c
	void setc(int i) { // nastaveni hodnoty c
		c = i;
	}
	int getc() { // nacteni hodnoty c
		return c;
	}
}
class AccessTest {
	public static void main(String[] args) {
		Test5 ob = new Test5();
		
		// Tyto prikazy jsou OK,
		// k promennym a a b lze pristupovat primo
		ob.a = 10;
		ob.b = 20;
		
		// Tento prikaz neni OK a povede k chybe
		// ob.c = 100; // Chyba!
		
		// K promenne c je nutne pristupovat pouze prostrednictvim metod
		ob.setc(100); // OK
		System.out.println("Hodnoty a, b a c: " + ob.a + " " + ob.b + " " + ob.getc());
		
		

	}

}
