class ThreadDemo {

	public static void main(String[] args) {
		new NewThread(); // vytvoreni noveho vlakna
		try {
			for(int i=5; i > 0; i--) {
				System.out.println("Hlavni (rodicovske) vlakno: " + i);
				Thread.sleep(1000);
			}
		}
		
		catch (InterruptedException e) {
			System.out.println("Hlavni (rodicovske) vlakno preruseno.");
		}
		System.out.println("Ukonceni behu hlavniho (rodicovskeho) vlakna.");
	}

}
