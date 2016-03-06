package SuspendResume;

// Ukazka pouziti metod suspend() a resume().
// Tyto metody by v novem kodu nemely byt pouzivany
class NewThread implements Runnable {
	String name; // nazev vlakna
	Thread t;
	
	NewThread (String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("Vytvoreno nove vlakno: " + t);
		t.start(); // Spusteni vlakna
	}
	
	// Toto je vstupni bod druheho vlakna
	public void run() {
		try {
			for(int i=15; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(200);
			}
		}
		
		catch (InterruptedException e) {
			System.out.println("Beh vlakna " + name + " prerusen.");
		}
		
		System.out.println("Beh vlakna " + name + " ukoncen.");
	}

}
