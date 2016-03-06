package exchanger;

import java.util.concurrent.Exchanger;

// Ukazka pouziti tridy Exchanger.
public class ExgrDemo {

	public static void main(String[] args) {
		Exchanger<String> exgr = new Exchanger<String>();
		
		new UseString(exgr);
		new MakeString(exgr);
	}

}

// Vlakno vytvarejici retezec
class MakeString implements Runnable {
	Exchanger<String> exgr;
	String str;
	
	MakeString(Exchanger<String> exgr) {
		this.exgr = exgr;
		str = new String();
		
		new Thread(this).start();
	}
	
	public void run() {
		char ch = 'A';
		
		for (int i = 0; i < 3; i++) {
			// Naplneni bufferu
			for (int j = 0; j < 5; j++) {
				str += ch++;
			}
			
			try {
				// Vymena plneho bufferu za prazdny
				str = exgr.exchange(str);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}


//Vlakno vyuzivajici retezec
class UseString implements Runnable {
	Exchanger<String> exgr;
	String str;
	
	UseString(Exchanger<String> exgr) {
		this.exgr = exgr;
		
		new Thread(this).start();
	}
	
	public void run() {
		for (int i = 0; i < 3; i++) {
			
			try {
				// Vymena prazdneho bufferu za plny
				str = exgr.exchange(new String());
				
				System.out.println("Nacteno: " + str);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
