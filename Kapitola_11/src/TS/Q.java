package TS;

// Nespravna implementace tvurce a spotrebitele
class Q {
	int n;
	
	synchronized int get() {
		System.out.println("Predana hodnota: " + n);
		return n;
	}
	
	synchronized void put(int n) {
		this.n = n;
		System.out.println("Vlozena hodnota: " + n);
	}
}
