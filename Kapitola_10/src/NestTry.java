// Ukazka pouziti vnorenych prikazu try
class NestTry {
	public static void main(String[] args) {
		try {
			int a =  args.length;
			
			/* Neni-li pri spousteni programu zadan zadny argument,
			 * nasledujici prikaz bude generovat chybu deleni nulou.
			 */
			
			int b = 42 / a;
			
			System.out.println("Hodnota a = " + a);
			
			try { // vnoreny try blok
				/* Je-li pri spousteni programu zadan 1 argument,
				 * pak nasledujici kod bude generovat vyjimku
				 * deleni nulou
				 */
				
				if(a==1) a = a/(a-a); // deleni nulou
				
				/* Jsou-li pri spousteni programu zadany 2 argumenty,
				 * pak nasledujici kod generuje chybu index mimo rozsah.
				 */
				
				if(a==2) {
					int c[] = { 1 };
					c[42] = 99; // generovani vyjimky index mimo rozsah
				}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Index pole mimo rozsah: " + e);
			}
		}
		
		catch(ArithmeticException e) {
			System.out.println("Deleni nulou: " + e);
		}

	}

}
