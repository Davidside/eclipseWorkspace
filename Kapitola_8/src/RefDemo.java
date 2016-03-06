class RefDemo {
	public static void main(String[] args) {
		KrabiceHmotnost krabicehm = new KrabiceHmotnost(3, 5, 7, 8.37);
		Krabice obyckrabice = new Krabice();
		double obj;

		obj = krabicehm.objem();
		System.out.println("Objem krabice krabicehm je: " + obj);
		System.out.println("Hmotnost krabice krabicehm je " + krabicehm.hmotnost);
		System.out.println();

		// prirazeni odkazu na objekt typu Krabicehmotnost
		// promenne typu Krabice
		obyckrabice = krabicehm;
		
		obj = obyckrabice.objem(); // OK, metoda objem() je ve tride Krabice definovana
		System.out.println("Objem krabice obyckrabice je: " + obj);
		
		/* Nasledujici pirkaz je neplatny, protoze obyckrabice
		 * neobsahuje clena hotmnost.
		 */
		// System.out.println("Hmotnost krabice obyckrabice je " + obyckrabice.hmotnost);
	}

}

