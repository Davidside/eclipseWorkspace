// Ukazka pouziti bloku finally
class FinallyDemo {
	// Navrat z metody na zaklade vyvolani vyjimky.
	static void procA() {
		try {
			System.out.println("Uvnitr kodu metody procA.");
			throw new RuntimeException("demo");
		}
		finally {
			System.out.println("Blok finally metody procA");
		}
	}
	
	// Explicitni navrat z bloku try.
	static void procB() {
		try {
			System.out.println("Uvnitr kodu metody procB.");
			return;
		}
		finally {
			System.out.println("Blok finally metody procB");
		}
	}
	
	// Normalni provedeni bloku try
		static void procC() {
			try {
				System.out.println("Uvnitr kodu metody procC.");
			}
			finally {
				System.out.println("Blok finally metody procC");
			}
		}
	
	public static void main(String[] args) {
		try {
			procA();
		}
		catch (Exception e) {
			System.out.println("Vyjimka zachycena.");
		}
		
		procB();
		procC();

	}

}
