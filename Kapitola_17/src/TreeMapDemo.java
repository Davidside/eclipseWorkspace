import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		// Vytvoreni objektu tridy TreeMap.
		// Oproti HashMape srovnava objekty podle klice podle instrukci
		// Komparatoru, ktery defautlne je nastaven vzestupne u porovnatelnych
		// objektu (cisla, pismena)
		TreeMap<String, Double> treeMap = new TreeMap<String, Double>();

		// Pridani prvku do mapy
		treeMap.put("Frantisek Kremilek", new Double(3434.34));
		treeMap.put("Tomas Vochomurka", new Double(123.22));
		treeMap.put("Motyl Emanuel", new Double(1378.00));
		treeMap.put("Ferda Mravenec", new Double(99.22));
		treeMap.put("Josef Krtek", new Double(-19.08));
		
		// Nacteni mnoziny obsahujici vsechny zaznamy mapy.
		Set<Map.Entry<String, Double>> set = treeMap.entrySet();
		
		// Zobrazeni teto mnoziny.
		for(Map.Entry<String, Double> mapEntry : set) {
			System.out.print(mapEntry.getKey() + ": ");
			System.out.println(mapEntry.getValue());
		}
		
		System.out.println();
		
		// Zvyseni zustatku Motyla Emanuela o 1000.
		double balance = treeMap.get("Motyl Emanuel");
		treeMap.put("Motyl Emanuel", balance + 1000);
		System.out.println("Novy zustatek Motyla Emanuela: " + treeMap.get("Motyl Emanuel"));
		
	}

}
