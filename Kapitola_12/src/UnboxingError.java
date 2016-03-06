// Chyba vznikla v dusledku rucniho "rozbaleni".
class UnboxingError {

	public static void main(String[] args) {
		
		Integer iOb = 1000; // autoboxing hodnoty 1000
		
		int i = iOb.byteValue(); // rcni rozbaleni jako byte!!!
		
		System.out.println(i); // tento prikaz nezobrazi hodnotu 1000

	}

}
