package Interface;

/* Trida, ktera obsahuje rozhrani, avsak neimplementuje plne vsechny metody,
 * ktere jsou timto rozhranim definovany, musi byt deklarovana jako abstract.
 */

abstract class Incomplete implements Callback {
	int a, b;
	
	void show() {
		System.out.println(a + " " + b);
	}
}
