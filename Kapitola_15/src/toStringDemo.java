// Prekryti metody toString() tridy Krabice.
class Krabice {
	double sirka;
	double vyska;
	double hloubka;
	
	Krabice(double w, double h, double d) {
		sirka = w;
		vyska = h;
		hloubka = d;
	}
	
	public String toString() {
		return "Rozmery jsou " + sirka + " krat " +
				hloubka + " krat " + vyska + ".";
	}
}

class toStringDemo {

	public static void main(String[] args) {
		Krabice b = new Krabice(10, 12, 14);
		String s = "Krabice b: " + b; // slouceni objektu typu Krabice
		
		System.out.println(b); // prevod objektu typu Krabice na retezec
		System.out.println(s);

	}

}
