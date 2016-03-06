// Ukazka vytvoreni druheho vlakna
class NewThread implements Runnable {
	Thread t;
	
	NewThread () {
		// Vyvoreni druheho, noveho vlakna
		t = new Thread(this, "Ukazkove vlakno");
		System.out.println("Vlakno potomka (druhe vlakno): " + t);
		t.start(); // Spusteni vlakna
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
