package ExtendThread;
// Ukazka vytvoreni druheho vlakna
class NewThread extends Thread {
	
	NewThread () {
		// Vyvoreni druheho, noveho vlakna
		super ("Ukazkove vlakno");
		System.out.println("Vlakno potomka (druhe vlakno): " + this);
		start(); // Spusteni vlakna
	}
	
	// Toto je vstupni bod druheho vlakna
	public void run() {
		try {
			for(int i=5; i > 0; i--) {
				System.out.println("Vlakno potomka (druhe vlakno): " + i);
				Thread.sleep(500);
			}
		}
		
		catch (InterruptedException e) {
			System.out.println("Vlakno potomka (druhe vlakno) preruseno.");
		}
		
		System.out.println("Ukonceni behu vlakna potomka (druheho vlakna).");
	}

}
