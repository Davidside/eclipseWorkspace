import java.util.ArrayList;

// Jednoduchy priklad ukazujici vyuziti kolekce pro ukladani postovnich adres.

class Address {
	private String jmeno;
	private String ulice;
	private String mesto;
	private String stat;
	private String psc;
	
	Address(String n, String s, String c, String st, String cd) {
		jmeno = n;
		ulice = s;
		mesto = c;
		stat = st;
		psc = cd;
	}
	
	public String getPSC() {
		return psc;
	}
	
	public String toString() {
		return jmeno + "\n" + ulice + "\n" + psc + " " + mesto + "\n" + stat;
	}
}
class MailList {

	public static void main(String[] args) {
		ArrayList<Address> ml = new ArrayList<Address>();
		
		// Pridani prvku do spojoveho seznamu.
		ml.add(new Address("Frantisek Kremilek", "U parezu 21", "Praha 5", "Ceska republika", "150 00"));
		ml.add(new Address("Josef Vochomurka", "Lesni 15", "Brno 3", "Ceska republika", "613 00"));
		ml.add(new Address("Motyl Emanuel", "Lucni 14", "Ostrava 2", "Ceska republika", "710 00"));
		
		// Zobrazeni seznamu adres.
		for(Address element : ml) {
			System.out.println(element + "\n");
		}
		System.out.println();
		
		// Zobrazeni vsech psc
		for(Address element : ml) {
			System.out.println(element.getPSC());
		}
		System.out.println();

	}

}
