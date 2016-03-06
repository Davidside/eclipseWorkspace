package Synch;

class Synch {
	public static void main(String[] args) {
		Volejme cil = new Volejme();
		Volajici ob1 = new Volajici(cil, "Ahoj");
		Volajici ob2 = new Volajici(cil, "Svete");	
		Volajici ob3 = new Volajici(cil, "Synchronized");
		
		// cekani na dokonceni behu jednotlivych vlaken
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException e) {
			System.out.println("Beh vlakna prerusen.");
		}
	}
}
