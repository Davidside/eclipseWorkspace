package XML;

import java.util.ArrayList;
import java.util.Calendar;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;

public class DemoXML {

	public static void main(String[] args) {
		ArrayList<Uzivatel> uzivatele = new ArrayList<>();
		
		Calendar datum1 = Calendar.getInstance();
		datum1.set(2000, Calendar.MARCH, 21);
		Calendar datum2 = Calendar.getInstance();
		datum2.set(2012, Calendar.OCTOBER, 30);
		Calendar datum3 = Calendar.getInstance();
		datum3.set(2011, Calendar.JANUARY, 1);
		
		uzivatele.add(new Uzivatel("Pavel Slavik", 22, datum1));
		uzivatele.add(new Uzivatel("Jan Novak", 31, datum2));
		uzivatele.add(new Uzivatel("Tomas Marny", 16, datum3));
	}
	/**
	//XMLOutputFactory xof = XMLOutputFactory.newInstance();
	//XMLStreamWriter xsw = null;
	
	try {
	
	}
	catch (Exception e) {
		
	}
	finally {
		try {
			
		}
		catch (Exception e) {
			System.err.println("Chyba pri uzavirani souboru: " + e.getMessage());
		}
	}
	*/
}
