import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Ukazka pouziti komparatoru pro zajisteni razeni uctu podle prijmeni.

// Porovnani poslednich celych slov ve dvou retezcich.
class TComp implements Comparator<String> {
	public int compare(String a, String b) {
		int i, j, k;
		String aStr, bStr;
		
		aStr = a;
		bStr = b;
		
		// Nalezeni indexu zacatku prijmeni.
		i = aStr.lastIndexOf(' ');
		j = bStr.lastIndexOf(' ');
		
		k = aStr.substring(i).compareTo(bStr.substring(j));
		if(k == 0) { // prijmeni se shoduji, nutne zkontrolovat cele jmeno.
			return aStr.compareTo(bStr);
		}
		else {
			return k;
		}
		
		// Prekryti metody equals neni nutne
	}
}
public class TreeMapDemo2 {

	public static void main(String[] args) {

		// Vytvoreni objektu tridy TreeMap.
		TreeMap<String, Double> treeMap = new TreeMap<String, Double>(new TComp());

		// Pridani prvku do mapy
		treeMap.put("Frantisek Kremilek", new Double(3434.34));
		treeMap.put("Tomas Vochomurka", new Double(123.22));
		treeMap.put("Motyl Emanuel", new Double(1378.00));
		treeMap.put("Jan Vochomurka", new Double(99.22));
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
