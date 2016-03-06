package Synch;

// Tento program neni synchronizovany.
class Volejme {
	synchronized void volej(String zprava) {
		System.out.print("[" + zprava);
		try {
			Thread.sleep(1000);
		}
		
		catch(InterruptedException e) {
			System.out.println("Beh vlakna prerusen.");
		}
		
		System.out.println("]");
	}

}
