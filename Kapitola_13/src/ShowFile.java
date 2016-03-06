import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
 */
class ShowFile {

	public static void main(String[] args) {
		int i;
		FileInputStream fin;
		
		// Nejprve je nutne se presvedcit, ze byl zadan nazev souboru.
		if (args.length != 1) {
			System.out.println("Pouziti: ShowFile nazev_souboru");
			return;
		}
		
		// Pokus o otevreni souboru
		try {
			fin = new FileInputStream(args[0]);
		}
		
		catch (FileNotFoundException e) {
			System.out.println("Soubor nelze otevrit.");
			return;
		}
		
		// V tomto okamziku je soubor jiz otevren a lze z nej cist.
		// Nasledujici blok kodu cte znaky ze souboru az do okamziku,
		// kdy narazi na konec souboru.
		try {
			do {
				i = fin.read();
				if(i != -1) System.out.print((char) i);
			} while(i != -1);
		}
		catch (IOException e) {
			System.out.println("Chyba pri cteni souboru.");
		}
		
		
		// Zavreni souboru po vystupu z bloku try
		try {
			fin.close();
		}
		catch (IOException e) {
			System.out.println("Chyba pri zavirani souboru.");	
		}
		
	}

}
