package MultiThreadDemo;
// Vytvareni vice vlaken
class NewThread implements Runnable {
	String name; // nazev vlakna
	Thread t;
	
	NewThread (String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("Nove vlakno: " + t);
		t.start(); // Spusteni vlakna
	}
	
	// Toto je vstupni bod druheho vlakna
	public void run() {
		try {
			for(int i=5; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		}
		
		catch (InterruptedException e) {
			System.out.println("Beh vlakna " + name + " prerusen.");
		}
		
		System.out.println("Beh vlakna " + name + " ukoncen.");
	}

}
