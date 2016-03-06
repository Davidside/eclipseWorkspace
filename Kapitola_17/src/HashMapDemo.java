import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		// Vytvoreni objektu tridy HashMap.
		HashMap<String, Double> hashMap = new HashMap<String, Double>();

		// Pridani prvku do mapy
		// Je mozne psat i bez new Double(), staci pouze cislo
		// Takto je ale hned jasne ze vytvarim novou hodnotu
		// typu Double
		hashMap.put("Frantisek Kremilek", new Double(3434.34));
		hashMap.put("Tomas Vochomurka", new Double(123.22));
		hashMap.put("Motyl Emanuel", new Double(1378.00));
		hashMap.put("Ferda Mravenec", new Double(99.22));
		hashMap.put("Josef Krtek", new Double(-19.08));
		
		// Nacteni mnoziny obsahujici vsechny zaznamy mapy.
		Set<Map.Entry<String, Double>> set = hashMap.entrySet();
		
		// Zobrazeni teto mnoziny.
		for(Map.Entry<String, Double> mapEntry : set) {
			System.out.print(mapEntry.getKey() + ": ");
			System.out.println(mapEntry.getValue());
		}
		
		System.out.println();
		
		// Zvyseni zustatku Motyla Emanuela o 1000.
		double balance = hashMap.get("Motyl Emanuel");
		hashMap.put("Motyl Emanuel", balance + 1000);
		System.out.println("Novy zustatek Motyla Emanuela: " + hashMap.get("Motyl Emanuel"));
		
		System.out.println();
		
		// Po zmene v hashMape se zmenil i odkaz set
		// coz je pochopitelne, jelikoz je to jenom odkaz
		for(Map.Entry<String, Double> mapEntry : set) {
			System.out.print(mapEntry.getKey() + ": ");
			System.out.println(mapEntry.getValue());
		}
	}

}
