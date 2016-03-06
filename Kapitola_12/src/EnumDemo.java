// Vycet druhu jablek.
enum Jablko2 {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo {
	public static void main(String[] args) {
		Jablko2 ap;
		
		ap = Jablko2.RedDel;
		
		// Vystup hodnoty vyctu
		System.out.println("Hodnota promenne ap: " + ap);
		System.out.println();
		
		ap = Jablko2.GoldenDel;
		
		// Porovnani dvou hodnot vyctu.
		if(ap == Jablko2.GoldenDel) {
			System.out.println("Promenna ap obsahuje hodnotu GoldenDel.\n");
		}
		
		// Pouziti vyctu k rizeni prikazu switch
		switch(ap) {
		case Jonathan:
			System.out.println("Jablko Jonathan je cervene");
			break;
		case GoldenDel:
			System.out.println("Jablko Golden Delicious je zlute");
			break;
		case RedDel:
			System.out.println("Jablko Red Delicious je cervene");
			break;
		case Winesap:
			System.out.println("Jablko Winesap je cervene");
			break;
		case Cortland:
			System.out.println("Jablko Cortland je cervene");
			break;
		}
	}
}
