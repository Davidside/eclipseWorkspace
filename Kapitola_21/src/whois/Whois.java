package whois;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Whois {

	public static void main(String[] args) throws Exception {
		int c;
		
		// Vytvoreni soket pripojeneho k portu 43
		// serveru internic.net.
		try (Socket s = new Socket("whois.internic.net", 43)) {
			
			// Ziskani vstupnich a vystupnich proudu.
			InputStream in = s.getInputStream();
			OutputStream out = s.getOutputStream();
			
			// Sestaveni retezce obsahujici pozadavek
			String str = (args.length == 0 ? "interactivebrokers.com" : args[0]) + "\n";
			
			// Prevod na bajty
			byte buf[] = str.getBytes();
			
			// Odeslani pozadavku.
			out.write(buf);
			
			// Precteni a zobrazeni odpovedi
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
			}
		}
		// Soket je nyni uzavren
	}

}
