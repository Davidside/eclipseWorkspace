package phaserDemo2;

import java.util.concurrent.Phaser;

// Ukazka rozsireni tridy Phaser a prekryti metody onAdvance() tak, ze
// bude proveden pouze zadany pocet fazi.

// Definice tridy MyPhaser, rozsirujici tridu Phaser a umoznujici provedeni
// pouze zadaneho poctu fazi
class MyPhaser extends Phaser {
	int numPhases;
	
	MyPhaser(int parties, int numPhases) {
		super(parties);
		this.numPhases = numPhases -1;
	}
	
	// Prekryti metody onAdvance() tak, aby umoznila provedeni pouze
	// zadaneho poctu fazi.
	
	@Override
	protected boolean onAdvance(int p, int regParties) {
		// Tento prikaz println() jsme zde pouzili pouze kvuli
		// nazornosti. Bezne se metoda onAdvance() nepouziva pro
		// zobrazovani jakehokoliv vystupu.
		System.out.println("Faze " + p + " dokoncena.\n");
		
		// Byly-li jiz dokonceny vsechny faze, je nutne vratit true.
		if(p == numPhases || regParties == 0) {
			return true;
		}
		// V opacne pripade musi byt vracena hodnota false;
		return false;
	}
}

public class PhaserDemo2 {

	public static void main(String[] args) {
		MyPhaser phsr = new MyPhaser(1, 4);
		
		System.out.println("Zahajeni behu.\n");
		
		new MyThread(phsr, "A");
		new MyThread(phsr, "B");
		new MyThread(phsr, "C");
		
		// Cekani na dokonceni zadaneho poctu fazi
		while (!phsr.isTerminated()) {
			phsr.arriveAndAwaitAdvance();
		}
		
		System.out.println("Beh objektu typu Phaser je ukoncen.");

	}

}

// Vlakno vyuzivajici objekt typu Phaser.
class MyThread implements Runnable {
	MyPhaser phsr;
	String name;
	
	MyThread(MyPhaser phsr, String name) {
		this.phsr = phsr;
		this.name = name;
		phsr.register();
		new Thread(this, name).start();
	}
	
	public void run() {
		while (!phsr.isTerminated()) {
			System.out.println("Vlakno " + name + " zahajuje fazi " + phsr.getPhase());
			phsr.arriveAndAwaitAdvance();
			
			// Chvilkove pozastaveni, zabranujici pomichanemu vystupu.
			// Toto je nutne pouze pro ucely ukazkoveho programu -
			// spravna funkce objektu typu Phaser toto nevyzaduje.
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
