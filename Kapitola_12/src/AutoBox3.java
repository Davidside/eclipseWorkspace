// Autoboxing a autounboxing probiha i uvnitr vyrazu
class AutoBox3 {

	public static void main(String[] args) {
		
		Integer iOb, iOb2;
		int i;
		
		iOb = 100;
		System.out.println("Puvodni hodnota iOb je: " + iOb);
		
		/* V tomto vyrazu dochazi k autounboxingu iOb,
		 * nasledne inkrementaci hodnoty a pote k opetovnemu
		 * autoboxingu vysledku iOb.
		 */
		
		++iOb;
		System.out.println("Po provedeni vyrazu ++iOb " + iOb);
		
		/* V tomto vyrazu dochazi k autounboxingu iOb,
		 * naslednemu vyhodnoceni vyrazu a pote k opetovnemu
		 * autoboxingu vysledku a jeho prirazeni objektu iOb2.
		 */
		iOb2 = iOb + (iOb / 3);
		System.out.println("Objekt iOb2 po provedeni vyrazu: " + iOb2);
		
		/* Proveden je tentyz vyraz avsak vysledek neni pomoci
		 * autoboxingu znovu "zabalen".
		 */
		i = iOb + (iOb / 3);
		System.out.println("Hodnota i po provedeni vyrazu: " + i);

	}

}
