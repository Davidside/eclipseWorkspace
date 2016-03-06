
class Exc2 {
	public static void main(String[] args) {
		int a, d;
		
		try { // hlidan bude nasledujici blok kodu
			d = 0;
			a = 42 / d;
			System.out.println("Tento text se vubec nezobrazi");
		}
		
		catch (ArithmeticException e) { // zachyceni chyby deleni nulou
			System.out.println("Deleni nulou");
		}
		System.out.println("Tento prikaz je proveden po prikazu catch.");
	}

}
