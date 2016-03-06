package ucDemo;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

// Ukazka prace s tridou URLConnection
public class UCDemo {

	public static void main(String args[]) throws Exception {
		int c;
		URL hp = new URL("http://www.cpress.cz");
		URLConnection hpCon = hp.openConnection();
		
		// nacteni data
		long d = hpCon.getDate();
		if(d == 0) {
			System.out.println("Datum neni dostupne.");
		} else {
			System.out.println("Datum: " + new Date(d));
		}
		
		// nacteni typu obsahu
		System.out.println("Content-type: " + hpCon.getContentType());
		
		// nacteni data vyprseni platnosti
		d = hpCon.getExpiration();
		if(d == 0) {
			System.out.println("Datum vyprseni platnosti neni dostupne.");
		} else {
			System.out.println("Platnost do: " + new Date(d));
		}
		
		// nacteni data posledni zmeny
		d = hpCon.getLastModified();
		if(d == 0) {
			System.out.println("Datum poslendi zmeny neni dostupne.");
		} else {
			System.out.println("Posledni zmena dne: " + new Date(d));
		}
		
		// Nacteni velikosti obsahu
		long len = hpCon.getContentLengthLong();
		if(len == -1) {
			System.out.println("Informace o velikosti obsahu neni dostupna.");
		} else {
			System.out.println("Content-Length : " + len);
		}
		
		if(len != 0) {
			System.out.println("=== Obsah ===");
			try (InputStream input = hpCon.getInputStream()) {
				while (((c = input.read()) != -1)) {
					System.out.print((char) c);
				}
			}
		} else {
			System.out.println("Zadny obsah neni dostupny");
		}
	}

}
