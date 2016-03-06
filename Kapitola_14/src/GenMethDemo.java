// Ukazka jednoduche genericke metody.
class GenMethDemo {
	
	// Zjisteni, zda dany objekt je prvkem pole.
	static <T, V extends T> boolean isIn(T x, V[] y) {
		for(int i=0; i < y.length; i++) {
			if(x.equals(y[i])) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// Pouziti metody isIn() pro objekty typu Integer.
		Integer nums[] = { 1, 2, 3, 4, 5 };
		
		if(isIn(2, nums)) {
			System.out.println("Cislo 2 je v poli nums");
		}
			
		if(!isIn(7, nums)) {
			System.out.println("Cislo 7 neni v poli nums");
		}
		
		System.out.println();
		
		// Pouziti metody isIn() pro objekty typu String.
		String strs[] = { "jedna", "dve", "tri", "ctyri", "pet" };
		
		if(isIn("dve", strs)) {
			System.out.println("Retezec dve je v poli strs");
		}
		
		if(!isIn("sedn", strs)) {
			System.out.println("Retezec sedm neni v poli strs");
		}
		
		// Z NEJAKEHO DUVODU TOTO MOZNE ZKOMPILOVAT LZE ?!?!
		// Toto nebude mozne zkompilovat! Typy musi byt kompatibilni.
		// if(isIn("dve", nums)) {
		// 		System.out.println("Retezec dve je v poli nums");
		// } 
	}

}
