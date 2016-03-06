import java.io.FileInputStream;
import java.io.IOException;

/*
* Tato verze programu ShowFile vyuziva prikaz try-with-resources
* k automatickemu uzavreni souboru ve chvili, kdy jiz neni nadale potrebny.
* Poznamka: tento kod vyzaduje JDK 7 ci novejsi
 */
class ShowFile4 {

	public static void main(String[] args) {
		int i;
		
		// Nejprve je nutne se presvedcit, ze byl zadan nazev souboru.
		if (args.length != 1) {
			System.out.println("Pouziti: ShowFile4 nazev_souboru");
			return;
		}
		
		// Nasledujici blok kodu vyuziva prikaz try-with-resources
		// k otevreni souboru a k jeho automatickemu uzavreni ve chvili,
		// kdy kod opousti blok try.
		try (FileInputStream fin = new FileInputStream(args[0])) {
			
			do {
				i = fin.read();
				if(i != -1) System.out.print((char) i);
			} while(i != -1);
		}
		
		catch (IOException e) {
			System.out.println("I/O chyba: " + e);
		}
	}
}
