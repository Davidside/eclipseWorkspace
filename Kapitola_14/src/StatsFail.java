/* Trida StatsFail je neuspesnym pokusem
 * o vytvoreni genericke tridy schopne
 * vypocitat prumer pole cisel jakehokoliv
 * zadaneho typu.
 */

// Kod tridy obsahuje chybu!
class StatsFail<T> {
	T[] nums; // nums je pole typu T
	
	// Predani odkazu na pole typu T
	// konstruktoru tridy.
	StatsFail(T[] o) {
		nums = o;
	}

	// Vraceni typu double ve vsech pripadech.
	double average() {
		double sum = 0.0;
		for(int i=0; i < nums.length; i++) {
			sum += nums[i].doubleValue(); // Chyba;
		}
		return sum / nums.length;
	}
}
