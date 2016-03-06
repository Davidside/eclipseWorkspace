package simpExec;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Jednoducha ukazka vyuziti exekutoru.
public class SimpExec {

	public static void main(String[] args) {
		CountDownLatch cdl1 = new CountDownLatch(5);
		CountDownLatch cdl12 = new CountDownLatch(5);
		CountDownLatch cdl13 = new CountDownLatch(5);
		CountDownLatch cdl14 = new CountDownLatch(5);
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		System.out.println("Zahajeni behu");
		
		// Spusteni jednotlivych vlaken.
		es.execute(new MyThread(cdl1, "Vlakno A"));
		es.execute(new MyThread(cdl12, "Vlakno B"));
		es.execute(new MyThread(cdl13, "Vlakno C"));
		es.execute(new MyThread(cdl14, "Vlakno D"));
		
		try {
			cdl1.await();
			cdl12.await();
			cdl13.await();
			cdl14.await();
			
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		es.shutdown();
		
		System.out.println("Hotovo");

	}

}

class MyThread implements Runnable {
	CountDownLatch cdl;
	String name;
	
	MyThread(CountDownLatch cdl, String name) {
		this.cdl = cdl;
		this.name = name;
		
		new Thread(this);
	}
	
	public void run() {
		for (int i = 0; i < 5 ; i++) {
			System.out.println(name + ": " + i);
			cdl.countDown();
			
		}
	}
}
