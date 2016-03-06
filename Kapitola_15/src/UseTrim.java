import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Ukazka pouziti metody trim() ke zpracovani prikazu.


class UseTrim {

	public static void main(String[] args) throws IOException {
		
		// vytvoreni objektu BufferedReader pomoci System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		System.out.println("Program ukoncete zadanim 'stop'.");
		System.out.println("Zadejte stat: ");
		do {
			str = br.readLine();
			str = str.trim(); // odstraneni mezer
			if(str.equals("Illinois")) {
				System.out.println("Hlavni mesto je Springfield.");
			}
			else if(str.equals("Missouri")) {
				System.out.println("Hlavni mesto je Jefferson City.");
			}
			else if(str.equals("California")) {
				System.out.println("Hlavni mesto je Sacramento.");
			}
			else if(str.equals("Washington")) {
				System.out.println("Hlavni mesto je Olympia.");
			}
		} while(!str.equals("stop"));

	}

}
