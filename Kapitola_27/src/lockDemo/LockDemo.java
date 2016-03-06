package lockDemo;

import java.util.concurrent.locks.ReentrantLock;

// Jednoduchy priklad pouziti zamku
public class LockDemo {

	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();
		
		new LockThread(lock, "A");
		new LockThread(lock, "B");

	}

}

// sdileny prostredek.
class Shared {
	static int count = 0;
}

// Vlakno zajistujici navyseni hodnoty promenne Shared.count.
class LockThread implements Runnable {
	ReentrantLock lock;
	String name;
	
	LockThread(ReentrantLock lock, String name) {
		this.lock = lock;
		this.name = name;
		
		new Thread(this, name).start();
	}
	
	public void run() {
		System.out.println("Zahajeni behu vlakna " + name);
		try {
			// Nejprve je nutne ziskat zamek pro
			// promennou Shared.count.
			System.out.println("Vlakno " + name + " ceka na zamek k promenne Shared.count.");
			lock.lock();
			System.out.println("Vlakno " + name + " ziskalo zamek k promenne Shared.count.");
			
			Shared.count++;
			System.out.println("Vlakno " + name + ": " + Shared.count);
			
			// Je-li to mozne, provedeni prepnuti kontextu.
			System.out.println("Vlakno " + name + " pozastavuje svuj beh.");
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
			System.out.println(e);
		}
		finally {
			// Uvolneni zamku
			System.out.println("Vlakno " + name + " uvolnuje zamek k promenne Shared.count");
			lock.unlock();
		}
	}
}