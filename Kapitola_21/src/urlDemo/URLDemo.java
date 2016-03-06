package urlDemo;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

// Ukazka prace s tridou URL
public class URLDemo {

	public static void main(String[] args) throws MalformedURLException{
		URL hp = new URL("http://www.HerbSchildt.com/Articles");
		
		System.out.println("Protokol: " + hp.getProtocol());
		System.out.println("Port: " + hp.getPort());
		
		System.out.println("Nazev pocitace: " + hp.getHost());
		System.out.println("Soubor: " + hp.getFile());
		System.out.println("URL jako retezec: " + hp.toExternalForm());

	}

}
