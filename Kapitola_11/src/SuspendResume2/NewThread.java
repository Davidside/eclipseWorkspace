package SuspendResume2;

// Ukazka pouziti metod suspend() a resume().
// Tyto metody by v novem kodu nemely byt pouzivany
class NewThread implements Runnable {
	String name; // nazev vlakna
	Thread t;
	boolean suspendFlag;
	
	NewThread (String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("Vytvoreno nove vlakno: " + t);
		suspendFlag = false;
		t.start(); // Spusteni vlakna
	}
	
	// Toto je vstupni bod druheho vlakna
	public void run() {
		try {
			for(int i=15; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(200);
				synchronized(this) {
					while (suspendFlag) {
						wait();
					}
				}
			}
		}
		
		catch (InterruptedException e) {
			System.out.println("Beh vlakna " + name + " prerusen.");
		}
		
		System.out.println("Beh vlakna " + name + " ukoncen.");
	}
	
	synchronized void mysuspend () {
		suspendFlag = true;
	}
	
	synchronized void myresume () {
		suspendFlag = false;
		notify();
	}

}
