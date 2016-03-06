package phaserDemo;

import java.util.concurrent.Phaser;

// Ukazka pouziti objektu tridy Phaser.
public class PhaserDemo {

	public static void main(String[] args) {
		Phaser phsr = new Phaser(1);
		int curPhase;
		
		System.out.println("Zahajeni behu");
		
		new MyThread(phsr, "A");
		new MyThread(phsr, "B");
		new MyThread(phsr, "C");

		// Cekani do chvile, nez vsechna vlakna dokonci fazi jedna.
		curPhase = phsr.getPhase() + 1;
		phsr.arriveAndAwaitAdvance();
		System.out.println("Faze " + curPhase + " dokoncena.");
		
		// Cekani do chvile, nez vsechna vlakna dokonci fazi dve.
		curPhase = phsr.getPhase() + 1;
		phsr.arriveAndAwaitAdvance();
		System.out.println("Faze " + curPhase + " dokoncena.");
		
		// Cekani do chvile, nez vsechna vlakna dokonci fazi tri.
		curPhase = phsr.getPhase() + 1;
		phsr.arriveAndAwaitAdvance();
		System.out.println("Faze " + curPhase + " dokoncena.");
		
		// Odregistrovani hlavni vlakna
		phsr.arriveAndDeregister();
		
		if(phsr.isTerminated()) {
			System.out.println("Beh objektu typu Phaser je ukoncen");
		}
	}

}

// Vlakno vyuzivajici objekt typu Phaser
class MyThread implements Runnable {
	Phaser phsr;
	String name;
	
	MyThread(Phaser phsr, String name) {
		this.phsr = phsr;
		this.name = name;
		phsr.register();
		new Thread(this, name).start();
	}
	
	public void run() {
		System.out.println("Vlakno " + name + " zahajuje fazi jedna.");
		// Signalizace dosazeno pozadovaneho bodu
		phsr.arriveAndAwaitAdvance();
		
		// Chvilkove pozastaveni, zabranujici pomichanemu vystupu.
		// Toto je nutne pouze pro ucely ukazkoveho programu -
		// spravna funkce objektu typu Phaser toto nevyzaduje.
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("Vlakno " + name + " zahajuje fazi dve.");
		// Signalizace dosazeno pozadovaneho bodu
		phsr.arriveAndAwaitAdvance();
		
		// Chvilkove pozastaveni, zabranujici pomichanemu vystupu.
		// Toto je nutne pouze pro ucely ukazkoveho programu -
		// spravna funkce objektu typu Phaser toto nevyzaduje.
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("Vlakno " + name + " zahajuje fazi tri.");
		// Signalizace dosazeno pozadovaneho bodu a odregistrovani
		phsr.arriveAndDeregister();
	}
}