package countDownLatch;

import java.util.concurrent.CountDownLatch;

//Ukazka pouziti tridy CountDownLatch.
public class CDLDemo {

	public static void main(String[] args) {
		CountDownLatch cdl = new CountDownLatch(5);
		
		System.out.println("Zahajeni behu");
		
		new MyThread(cdl);
		
		try {
			cdl.await();
		} catch (InterruptedException exc) {
			System.out.println(exc);
		}
		
		System.out.println("Hotovo");

	}

}

class MyThread implements Runnable {
	CountDownLatch cdl;
	
	MyThread(CountDownLatch cdl) {
		this.cdl = cdl;
		new Thread(this).start();
	}
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(i);
			cdl.countDown(); // snizeni pocitadla
		}
	}
}
