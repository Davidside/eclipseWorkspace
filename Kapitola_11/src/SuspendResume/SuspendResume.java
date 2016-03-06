package SuspendResume;

//Ukazka pouziti metod suspend() a resume().
//Tyto metody by v novem kodu nemely byt pouzivany
class SuspendResume {

	public static void main(String[] args) {
		NewThread ob1 = new NewThread("Jedna");
		NewThread ob2 = new NewThread("Dve");

		try {
			Thread.sleep(1000);
			ob1.t.suspend();
			System.out.println("Pozastaveni behu vlakna Jedna.");
			Thread.sleep(1000);
			ob1.t.resume();
			System.out.println("Obnoveni behu vlakna Jedna.");
			
			ob2.t.suspend();
			System.out.println("Pozastaveni behu vlakna Dve.");
			Thread.sleep(1000);
			ob2.t.resume();
			System.out.println("Obnoveni behu vlakna Dve.");
		}
		catch (InterruptedException e) {
			System.out.println("Hlavni (rodicovske) vlakno preruseno.");
		}
		
		// cekani na dokonceni behu vlaken
		try {
			System.out.println("Cekani na dokonceni behu ostatnich vlaken.");
			ob1.t.join();
			ob2.t.join();
		}
		
		catch (InterruptedException e) {
			System.out.println("Hlavni (rodicovske) vlakno preruseno.");
		}
		
		System.out.println("Beh hlavniho vlakna ukoncen.");
	}

}
