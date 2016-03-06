package MultiThreadDemo;
class DemoJoin {

	public static void main(String[] args) {
		NewThread ob1 = new NewThread("Jedna");
		NewThread ob2 = new NewThread("Dve");
		NewThread ob3 = new NewThread("Tri");
		
		System.out.println("Vlakno Jedna bezi: " + ob1.t.isAlive());
		System.out.println("Vlakno Dve bezi: " + ob2.t.isAlive());
		System.out.println("Vlakno Tri bezi: " + ob3.t.isAlive());
		
		// cekani na dokonceni behu vlaken
		try {
			System.out.println("Cekani na dokonceni behu ostatnich vlaken.");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		
		catch (InterruptedException e) {
			System.out.println("Hlavni (rodicovske) vlakno preruseno.");
		}
		
		System.out.println("Vlakno Jedna bezi: " + ob1.t.isAlive());
		System.out.println("Vlakno Dve bezi: " + ob2.t.isAlive());
		System.out.println("Vlakno Tri bezi: " + ob3.t.isAlive());
		System.out.println("Ukonceni behu hlavniho (rodicovskeho) vlakna.");
	}

}
