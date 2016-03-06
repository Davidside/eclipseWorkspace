package TSOpraveny;

// Nespravna implementace tvurce a spotrebitele
class Q {
	int n;
	boolean valueSet = false;
	
	synchronized int get() {
		while(!valueSet)
			try {
				wait();
			}
	
			catch(InterruptedException e) {
				System.out.println("Zachycena vyjimka InterruptedException");
			}
		
			System.out.println("Predana hodnota: " + n);
			valueSet = false;
			notify();
			return n;
	}
	
	synchronized void put(int n) {
		while(valueSet)
			try {
				wait();
			}
		
			catch(InterruptedException e) {
				System.out.println("Zachycena vyjimka InterruptedException");
			}
		
			this.n = n;
			valueSet = true;
			notify();
			System.out.println("Vlozena hodnota: " + n);
	}
}
