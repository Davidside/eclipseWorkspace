import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Kopirovani souboru.
 * 
 * Chcete-li pouzit tento program, zadejte nazev zdrojoveho
 * a ciloveho souboru jako argumenty prikazoveho radku.
 * Pokud chcete zkopirovat soubor s nazvem ZDROJ.TXT
 * do souboru s nazem CIL.TXT, pouzijte nasledujici
 * prikaz:
 * 
 *  java CopyFile ZDROJ.TXT CIL.TXT
 */
class CopyFile {

	public static void main(String[] args) {
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		// Nejprve je nutne se presvedcit, ze byly zadany nazvy obou souboru.
		if (args.length != 2) {
			System.out.println("Pouziti: CopyFile zdrojovy_soubor cilovy_soubor");
			return;
		}
		
		// Kopirovani souboru.
		try {
			// Pokus o otevreni souboru
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);
	
			do {
				i = fin.read();
				if(i != -1) fout.write(i);
			} while(i != -1);
		}
		
		catch (IOException e) {
			System.out.println("I/O chyba: " + e);
		}
		
		finally {
			try {
				if(fin != null) fin.close();
			}
			
			catch (IOException e2) {
				System.out.println("Chyba pri zavirani vstupniho souboru.");
			}
			try {
				if(fout != null) fout.close();
			}
			
			catch (IOException e2) {
				System.out.println("Chyba pri zavirani vystupniho souboru.");
			}
		}
	}
}
