package TS;

class Tvurce implements Runnable {
	Q q;
	
	Tvurce(Q q) {
		this.q = q;
		new Thread(this, "Tvurce").start();
	}
	
	public void run() {
		int i = 0;
		while(true) {
			q.put(i++);
		}
	}

}
