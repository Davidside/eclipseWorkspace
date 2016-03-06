package MultiThreadDemo;
class MultiThreadDemo {

	public static void main(String[] args) {
		new NewThread("Jedna"); // spusteni vlaken
		new NewThread("Dve");
		new NewThread("Tri");
		
		try {
			Thread.sleep(10000);
		}
		
		catch (InterruptedException e) {
			System.out.println("Hlavni (rodicovske) vlakno preruseno.");
		}
		System.out.println("Ukonceni behu hlavniho (rodicovskeho) vlakna.");
	}

}
