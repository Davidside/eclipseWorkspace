package TSOpraveny;

class Spotrebitel implements Runnable {
	Q q;
	
	Spotrebitel(Q q) {
		this.q = q;
		new Thread(this, "Spotrebitel").start();
	}
	
	public void run() {
		while(true) {
			q.get();
		}
	}

}
