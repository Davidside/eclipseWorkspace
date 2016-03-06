package cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

// Ukazka pouziti tridy CyclicBarrier

public class BarDemo {

	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

		System.out.println("Zahajeni behu");
		
		new MyThread(cb, "Vlakno A");
		new MyThread(cb, "Vlakno B");
		new MyThread(cb, "Vlakno C");
		new MyThread(cb, "Vlakno X");
		new MyThread(cb, "Vlakno Y");
		new MyThread(cb, "Vlakno Z");
	}

}

//Vlakno vyuzivajici objekt tridy CyclicBarrier.
class MyThread implements Runnable {
	CyclicBarrier cbar;
	String name;
	
	MyThread(CyclicBarrier cb, String name) {
		cbar = cb;
		this.name = name;
		new Thread(this).start();
	}
	
	public void run() {
		System.out.println(name);
		
		try {
			cbar.await();
		} catch (BrokenBarrierException e) {
			System.out.println(e);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
	}
}
// Objekt teto tridy je volan ve chvili, kdy
// dojde k uvolneni objektu tridy CyclicBarrier
class BarAction implements Runnable {
	public void run() {
		System.out.println("Dosazeno bariery");
	}
}
