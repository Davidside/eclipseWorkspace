import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Jednoducha ukazka vyhledavani shody se zadanym vzorem
public class RegExpr {

	public static void main(String[] args) {
		Pattern pattern;
		Matcher matcher;
		boolean found;
		
		// Definice vzoru a objektu typu Matcher.
		pattern = Pattern.compile("Java");
		matcher = pattern.matcher("Java");
		
		// Nasleduje vlastni hledani shody
		found = matcher.matches();
		
		System.out.println("Priklad cislo 1:");
		System.out.println("Vyhledani retezce Java ve vstupni posloupnosti Java.");
		
		if(found) {
			System.out.println("Shoda nalezena!");
		}
		else {
			System.out.println("Shoda NEnalezena!");
		}
		
		System.out.println();

		System.out.println("Priklad cislo 2:");
		System.out.println("Vyhledani retezce Java ve vstupni posloupnosti Java 7.");
		
		// Vytvoreni noveho objektu typu Matcher
		matcher = pattern.matcher("Java 7");
		
		// Nasleduje vlastni hledani shody.
		found = matcher.matches();
		
		if(found) {
			System.out.println("Shoda nalezena!");
		}
		else {
			System.out.println("Shoda NEnalezena!");
		}
		
		System.out.println();
		
		// Pouziti metody find() k vyhledani podretezce shodneho se zadanym vzorem
		System.out.println("Priklad cislo 3:");
		System.out.println("Vyhledani retezce Java ve vstupni posloupnosti Java 7 pomoci metody find().");
		
		found = matcher.find();
		
		if(found) {
			System.out.println("Shodny podretezec nalezen!");
		}
		else {
			System.out.println("Shodny podretezec NEnalezen!");
		}
		
		System.out.println();
		
		// Pouziti metody find() k vyhledani vice vyskytu vzoru.
		// Pokud v v matcher nenanjde podretezec, nevyvola se vyjimka
		System.out.println("Priklad cislo 4:");
		pattern = Pattern.compile("test");
		matcher = pattern.matcher("test 1 2 3 test");
		
		while(matcher.find()) {
			System.out.println("Retezec test nalezen na pozici " + matcher.start());
		}
		
		System.out.println();
		
		// Ukazka pouziti kvantifikatoru
		System.out.println("Priklad cislo 5:");
		pattern = Pattern.compile("W+");
		matcher = pattern.matcher("W WW WWW");
		
		while(matcher.find()) {
			System.out.println("Nalezena shoda: " + matcher.group());
		}
		
		System.out.println();
		
		// Ukazka pouziti zastupneho znaku spolu s kvatifikatorem
		// pouziti zastupneho znaku . hleda nejdelsi mozna shoda
		System.out.println("Priklad cislo 6:");
		pattern = Pattern.compile("d.+t");
		matcher = pattern.matcher("dolovat nahoru donest doprava");
		
		while(matcher.find()) {
			System.out.println("Nalezena shoda: " + matcher.group());
		}
		
		System.out.println();
		
		// Ukazka pouziti kvantifikatoru ?
		// pouziti kvantifikatoru ? omezuje na hledani nejkratsi
		// mozne shody
		System.out.println("Priklad cislo 7:");
		pattern = Pattern.compile("d.+?t");
		matcher = pattern.matcher("dolovat nahoru donest doprava");
				
		while(matcher.find()) {
			System.out.println("Nalezena shoda: " + matcher.group());
		}
				
		System.out.println();
		
		// Ukazka pouziti tridy znaku.
		System.out.println("Priklad cislo 8:");
		pattern = Pattern.compile("[a-z]+");
		matcher = pattern.matcher("toto je maly test.");
				
		while(matcher.find()) {
			System.out.println("Nalezena shoda: " + matcher.group());
		}
				
		System.out.println();
		
		// Ukazka pouziti metody replaceAll()
		System.out.println("Priklad cislo 9:");
		
		String str = "Jon Jonathan Frank Ken Todd";
		pattern = Pattern.compile("Jon.*? ");
		matcher = pattern.matcher(str);
				
		System.out.println("Puvodni vstupni posloupnost: " + str);
		
		str = matcher.replaceAll("Eric ");
		
		System.out.println("Upravena posloupnost: " + str);
		
		System.out.println();
		
		// Ukazka pouziti metody split()
		System.out.println("Priklad cislo 10:");
	
		// Regularni vyraz definujici hledane oddelovace
		pattern = Pattern.compile("[ ,.!]");
		
		String strs[] = pattern.split("jedna dve,alfa9 12!hotovo.");
						
		for(int i=0; i < strs.length; i++) {
			System.out.println("Dalsi token: " + strs[i]);
		}
	}

}
