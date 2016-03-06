package httpURLDemo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Ukazka prace s tridou HttpURLConnection
public class HttpURLDemo {

	public static void main(String[] args) throws Exception {
		URL hp = new URL("http://www.google.com");
		
		HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
		
		// Zobrazeni metody pozadavku
		System.out.println("Metoda pozadavku je " + hpCon.getRequestMethod());
		
		// Zobrazeni kodu odpovedi.
		System.out.println("Kod odpovedi je " + hpCon.getResponseCode());
		
		// Zobrazeni zpravy odpovedi
		System.out.println("Zprava odpovedi je " + hpCon.getResponseMessage());

		// Nacteni seznamu poli hlavickz a mnoziny klicu hlavicky
		Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
		Set<String> hdrField = hdrMap.keySet();
		System.out.println("\nNize nasleduje hlavicka");
		
		// Zobrazeni vsech klicu hlavickz a jejich hodnot.
		for(String k : hdrField) {
			System.out.println("Klic: " + k + " Hodnota: " + hdrMap.get(k));
		}
	}

}
