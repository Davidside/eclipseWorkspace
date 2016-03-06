package semDemo;
import java.util.concurrent.Semaphore;

// Jednoducha ukazka prace se semaforem.

public class SemDemo {

	public static void main(String[] args) {
		Semaphore sem = new Semaphore(1);
		
		new IncThread(sem, "A");
		new DecThread(sem, "B");
	}
}

// Definice sdileneho prostredku
class Shared {
	static int count = 0;
}

// Vlakno provadeni navysujici hodnotu promenne count.
class IncThread implements Runnable {
	String name;
	Semaphore sem;
	
	IncThread(Semaphore s, String n) {
		sem = s;
		name = n;
		new Thread(this).start();
	}
	
	public void run() {
		
		System.out.println("Po spusteni vlakna " + name);
		
		try {
			// Nejprve je nutne ziskat povoleni.
			System.out.println("Vlakno " + name + " ceka na povoleni.");
			sem.acquire();
			System.out.println("Vlakno " + name + " ziskalo povoleni");
			
			// Nyni je mozny pristup ke sdilenemu prostredku.
			for(int i=0; i < 5; i++) {
				Shared.count++;
				System.out.println(name + ": " + Shared.count);
				
				// Nyni lze povolit prepnuti kontextu - 
				// je-li ovsem vubec mozne
				Thread.sleep(10);
			}
		}
		catch (InterruptedException exc) {
			System.out.println(exc);
		}
		
		// Uvolneni povoleni.
		System.out.println("Vlakno " + name + " uvolnilo povoleni.");
		sem.release();
	}
}

//Vlakno provadeni snizujici hodnotu promenne count.
class DecThread implements Runnable {
	String name;
	Semaphore sem;
	
	DecThread(Semaphore s, String n) {
		sem = s;
		name = n;
		new Thread(this).start();
	}
	
	public void run() {
		
		System.out.println("Po spusteni vlakna " + name);
		
		try {
			// Nejprve je nutne ziskat povoleni.
			System.out.println("Vlakno " + name + " ceka na povoleni.");
			sem.acquire();
			System.out.println("Vlakno " + name + " ziskalo povoleni");
			
			// Nyni je mozny pristup ke sdilenemu prostredku.
			for(int i=0; i < 5; i++) {
				Shared.count--;
				System.out.println(name + ": " + Shared.count);
				
				// Nyni lze povolit prepnuti kontextu - 
				// je-li ovsem vubec mozne
				Thread.sleep(10);
			}
		}
		catch (InterruptedException exc) {
			System.out.println(exc);
		}
		
		// Uvolneni povoleni.
		System.out.println("Vlakno " + name + " uvolnilo povoleni.");
		sem.release();
	}
}
