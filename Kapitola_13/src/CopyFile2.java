import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Tato verze programu CopyFile vyuziva prikaz try-with-resources.
 * V programu je ukazana sprava  dvou prostredku )v tomto pripade
 * souboru) jedinym prikazem try
 */

class CopyFile2 {

	public static void main(String[] args) {
		int i;
		
		// Nejprve je nutne se presvedcit, ze byly zadany nazvy obou souboru.
		if (args.length != 2) {
			System.out.println("Pouziti: CopyFile zdrojovy_soubor cilovy_soubor");
			return;
		}
		
		// Otevreni a sprava souboru prostrednictvim prikazu try-with-resources
		try (FileInputStream fin = new FileInputStream(args[0]);
			 FileOutputStream fout = new FileOutputStream(args[1]))
		{
	
			do {
				i = fin.read();
				if(i != -1) fout.write(i);
			} while(i != -1);
		}
		
		catch (IOException e) {
			System.out.println("I/O chyba: " + e);
		}
	}
}
