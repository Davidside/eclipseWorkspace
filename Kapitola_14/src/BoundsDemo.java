/* V teto verzi tridy Stats musi byt typovy argument,
 * ktery bude predavan typovemu parametru T,
 * bud typu Number, anebo typu jakekoliv tridy
 * odvozene od Number.
 */

class Stats<T extends Number> {
	T[] nums; // pole typu Number ci podtridy
	
	// Predani odkazu na pole typu Number ci podtridy
	// konstruktoru tridy.
	Stats(T[] o) {
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

// Ukazka prace s tridou Stats.
class BoundsDemo {
	public static void main(String args[]) {
		Integer inums[] = { 1, 2, 3, 4, 5 };
		Stats<Integer> iob = new Stats<Integer>(inums);
		double v = iob.average();
		System.out.println("Prumerna hodnota pole iob je " + v);
		
		Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Stats<Double> dob = new Stats<Double>(dnums);
		double w = dob.average();
		System.out.println("Prumerna hodnota pole dob je " + w);
		
		// Tyto prikazy nebude mozne zkompilovat, nebot
		// String neni podtridou Number.
		// String strs[] = { "1", "2", "3", "4", "5"};
		// Stats<String> strob = new Stats<String>(strs);
		// double x = strob.average();
		// System.out.println("Prumerna hodnota pole strob je " + x);
	}
}
