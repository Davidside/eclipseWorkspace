package prodCon;

import java.util.concurrent.Semaphore;

// Ukazka implementace tvurce a spotrebitele vuyivajici
// semafor k zajisteni a rizeni synchronizace

class Q {
	int n;
	
	// Zahajeni v situaci, kdy semafor spotrebitele neni dostupny.
	static Semaphore semCon = new Semaphore(0);
	static Semaphore semProd = new Semaphore(1);
	
	void get() {
		try {
			semCon.acquire();
		}
		catch(InterruptedException e) {
			System.out.println("Zachycena vyjimka InterruptedException");
		}
		
		System.out.println("Nacteno: " + n);
		semProd.release();
	}
	
	void put(int n) {
		try {
			semProd.acquire();
		}
		catch(InterruptedException e) {
			System.out.println("Zachycena vyjimka InterruptedException");
		}
		
		this.n = n;
		System.out.println("Vlozeno: " + n);
		semCon.release();
	}
}

class Producer implements Runnable {
	Q q;
	
	Producer(Q q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}
	
	public void run() {
		for(int i=0; i < 20; i++) {
			q.put(i);
		}
	}
}

class Consumer implements Runnable {
	Q q;
	
	Consumer(Q q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}
	
	public void run() {
		for(int i=0; i < 20; i++) {
			q.get();
		}
	}
}

public class ProdCon {

	public static void main(String[] args) {
		Q q = new Q();
		new Consumer(q);
		new Producer(q);

	}

}
