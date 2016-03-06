// Ukazka vzniku situace uvaznuti (deadlock).
class B {
	synchronized void bar(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " vstoupil do metody B.bar");
		
		try {
			Thread.sleep(1000);
		}
		
		catch(Exception e) {
			System.out.println("Beh B prerusen");
		}
		
		System.out.println(name + " se snazi volat metodu A.last()");
		a.last();
	}
	
	synchronized void last() {
		System.out.println("Uvnitr metody A.last");
	}

}
