package Multithreading;

public class MainVlakno {

	public static void main(String[] args) {
		System.out.println("Hlavni vlakno spusteno");
		Vlakno mojeVlakno = new Vlakno("Druhe vlakno");
		mojeVlakno.setDaemon(true);
		mojeVlakno.start();
		try {
			mojeVlakno.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Hlavni vlakno ukonèeno");
	}

}
