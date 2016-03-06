// Ukazka prace s prikazem assert podminka : vyraz
class AssertDemo2 {
	static int val = 3;
	
	// tato metoda vraci cele cislo.
	static int getnum() {
		return val--;
	}
	public static void main(String[] args) {
		int n;
		for(int i=0; i < 10; i++) {
			n = getnum();
			
			assert n > 0 : "Hodnota n je nula!"; // v pripade n=0 bude test neuspesny
			
			System.out.println("Hodnota n je " + n);
		}

	}

}
