// Ukazka vzniku situace uvaznuti (deadlock).
class Deadlock implements Runnable {
	A a = new A();
	B b = new B();
	
	Deadlock() {
		Thread.currentThread().setName("Hlavni vlakno");
		Thread t = new Thread(this, "Souperici vlakno");
		t.start();
		
		a.foo(b); // ziskani zamku na instanci a pro toto vlakno
		System.out.println("Zpet v hlavnim vlaknu");
	}
	
	public void run () {
		b.bar(a); // ziskani zamku na instanci a pro druhe vlakno
		System.out.println("Zpet v druhem vlaknu");
	}
	
	public static void main(String[] args) {
		new Deadlock();

	}

}
