package Synch2;

class Volajici implements Runnable {
	String zprava;
	Volejme cil;
	Thread t;
	
	public Volajici(Volejme targ, String s) {
		cil = targ;
		zprava = s;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		synchronized(cil) { // zde zacina synchronizovany blok
			cil.volej(zprava);
		}
	}
}
