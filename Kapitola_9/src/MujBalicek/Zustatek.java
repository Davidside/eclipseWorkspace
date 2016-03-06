// Jednoduchy balicek
package MujBalicek;

/* Trida Zustatek, jeji konstruktor a jeji metoda show() jsou
 * nyni deklarovany jako public. To znamena, ze je muze vyuzit jakakoliv trida
 * (tj. nikoliv jenom podtrida) nachazejici se mimo balicek MujBalicek.
 */

public class Zustatek {
	String jmeno;
	double zust;
	
	public Zustatek(String n, double b) {
		jmeno = n;
		zust = b;
	}
	
	public void show() {
		if(zust<0)
			System.out.print("--> ");
		System.out.println(jmeno + ": USD " + zust);
	}

}
