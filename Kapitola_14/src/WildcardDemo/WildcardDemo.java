package WildcardDemo;

// Pouziti zoliku.
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
	
	// Zjisteni, zda jsou prumery dvou  ruznych objektu
	// typu Stats shodne.
	// Vsimnete si pouziti zoliku
	boolean sameAvg(Stats<?> ob) {
		if(average() == ob.average()) {
			return true;
		}
		return false;
	}
}

// Ukazka prace se zolikem.
class WildcardDemo {
	public static void main(String args[]) {
		Integer inums[] = { 1, 2, 3, 4, 5 };
		Stats<Integer> iob = new Stats<Integer>(inums);
		double v = iob.average();
		System.out.println("Prumerna hodnota pole iob je " + v);
		
		Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Stats<Double> dob = new Stats<Double>(dnums);
		double w = dob.average();
		System.out.println("Prumerna hodnota pole dob je " + w);
		
		Float fnums[] = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
		Stats<Float> fob = new Stats<Float>(fnums);
		double x = fob.average();
		System.out.println("Prumerna hodnota pole fob je " + x);
		
		// Zjisteni, ktera z poli maji shodny prumer.
		System.out.print("Prumery poli iob a dob ");
		if(iob.sameAvg(dob)) {
			System.out.println("jsou shodne.");
		}
		else {
			System.out.println("jsou odlisne.");
		}
		
		System.out.print("Prumery poli iob a fob ");
		if(iob.sameAvg(fob)) {
			System.out.println("jsou shodne.");
		}
		else {
			System.out.println("jsou odlisne.");
		}
	}
}
