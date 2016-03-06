package Multithreading;

public class Vlakno extends Thread {

	public Vlakno(String jmeno) {
		super(jmeno);
	}
	
	@Override
	public void run() {
		System.out.println("Vlakno " + getName() + " spusteno");
		for(int i = 0; i < 4; i++) {
			System.out.println("Vlakno " + getName() + ": " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException ex) {
				System.err.println("Nepodarilo se uspat vlakno: " + ex);
			}
		}
		System.out.println("Vlakno " + getName() + " ukonceno");
	}
}
