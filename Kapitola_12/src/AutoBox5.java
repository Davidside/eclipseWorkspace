// Autoboxing / autounboxing datovych typu boolean a char.
class AutoBox5 {

	public static void main(String[] args) {
		
		// Autoboxing / autounboxing datoveho typu boolean
		Boolean b = true;
		
		/* Z nasledujici radku vyplyva, ze autounboxing
		 * probiha i tehdy, je-li prislusny objekt
		 * pouzit v podminkovem vyrazu, napriklad v if prikaze.
		 */
		
		if(b) {
			System.out.println("b je " + b);
			
		// Autoboxing / autounboxing datoveho typu char
			Character ch = 'x'; // autoboxing typu char
			char ch2 = ch; // auto-unboxing typu char
			
			System.out.println("ch2 je " + ch2);
		}

	}

}
