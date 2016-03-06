// Ukazka vzniku situace uvaznuti (deadlock).
class A {
	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " vstoupil do metody A.foo");
		
		try {
			Thread.sleep(1000);
		}
		
		catch(Exception e) {
			System.out.println("Beh A prerusen");
		}
		
		System.out.println(name + " se snazi volat metodu B.last()");
		b.last();
	}
	
	synchronized void last() {
		System.out.println("Uvnitr metody A.last");
	}

}
