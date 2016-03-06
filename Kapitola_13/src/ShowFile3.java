import java.io.FileInputStream;
import java.io.IOException;

/*
 * Zobrazeni textoveho souboru.
 * Chcete-li pouzit tento program, pak na prikazovem
 * radku musite zadat nazev toho, souboru, ktery ma
 * byt zobrazen. Pokud si chcete zobrazit napriklad 
 * obsah souboru TEST.TXT, pouzijte nasledujici 
 * prikaz:
 * 
 *  java ShowFile TEST.TXT
 *  
 *  V teto variante je veskery kod zajistujici otevreni
 *  souboru a cteni dat zabalen do jedineho bloku try.
 *  Soubor je uzavren v bloku finally.
 */
class ShowFile3 {

	public static void main(String[] args) {
		int i;
		FileInputStream fin = null;
		
		// Nejprve je nutne se presvedcit, ze byl zadan nazev souboru.
		if (args.length != 1) {
			System.out.println("Pouziti: ShowFile3 nazev_souboru");
			return;
		}
		
		// Nasledujici blok kodu cte znaky ze souboru az do okamziku,
		// kdy narazi na konec souboru.
		try {
			fin = new FileInputStream(args[0]);
	
			do {
				i = fin.read();
				if(i != -1) System.out.print((char) i);
			} while(i != -1);
		}
		
		catch (IOException e) {
			System.out.println("I/O chyba: " + e);
		}
		
		finally {
			// Zavreni souboru vse vsech pripadech
			try {
				if(fin != null) fin.close();
			}
			
			catch (IOException e) {
				System.out.println("Chyba pri zavirani souboru.");
			
			}
		}
	}
}
