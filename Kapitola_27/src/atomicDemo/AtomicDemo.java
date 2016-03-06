package atomicDemo;

import java.util.concurrent.atomic.AtomicInteger;

// Jednoducha ukazka pouziti atomickych operaci.
public class AtomicDemo {
	public static void main(String args[]) {
		new AtomThread("A");
		new AtomThread("B");
		new AtomThread("C");
	}
}

class Shared {
	static AtomicInteger ai = new AtomicInteger(0);
}

// Vlakno navysujici hodnotu promenne.
class AtomThread implements Runnable {
	String name;
	
	AtomThread(String name) {
		this.name = name;
		
		new Thread(this).start();
	}
	
	public void run() {
		System.out.println("Zahajeni behu vlakna " + name);
		
		for (int i = 0; i <= 3; i++) {
			System.out.println("Vlakno " + name + " nacetlo: " + Shared.ai.getAndSet(i));
		}
	}
}
