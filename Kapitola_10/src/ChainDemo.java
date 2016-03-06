// Ukazka pouziti zretezenych vyjimek.
class ChainDemo {
	static void demoproc() {
		
		// vytvoreni vyjimky
		NullPointerException e = new NullPointerException("vrchni vrstva");
		
		// pridani priciny
		e.initCause(new ArithmeticException("pricina"));
		
		// vyvolani vyjimek
		throw e;
	}

	public static void main(String[] args) {
		try {
			demoproc();
		}
		catch(NullPointerException e) {
			// zobrazeni vyjimky ve vrchni vrstve
			System.out.println("Zachycena vyjimka: " + e);
			
			// zobrazeni priciny vyjimky
			System.out.println("Puvodni pricina: " + e.getCause());
		}

	}

}
