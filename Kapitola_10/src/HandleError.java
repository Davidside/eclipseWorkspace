// Zpracovani vyjimky a pokracovani v behu programu.
import java.util.Random;

class HandleError {
	public static void main(String[] args) {
		int a, b, c;
		a = b = c = 0;
		Random r = new Random();
		
		for(int i=0; i<32000; i++) {
			try {
				b = r.nextInt();
				c = r.nextInt();
				a = 12345 / (b/c);
			}
			
			catch (ArithmeticException e) {
				System.out.println("Vyjimka: " + e);
				a = 0; // prirazeni nuly promenne a a pokracovani
			}
			
			System.out.println("Hodnota a: " + a);
		}

	}

}
