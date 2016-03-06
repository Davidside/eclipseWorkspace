import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Cteni retezce z konzoly pomoci BufferedReader.
class BRReadLines {

	public static void main(String[] args) throws IOException {
		// vytvoreni proudu BufferedReader, pripojeneho k System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		System.out.println("Zadavejte radky textu.");
		System.out.println("Program ukoncente zadanim slova 'stop'.");
		do {
			str = br.readLine();
			System.out.println(str);
		} while (!str.equals("stop"));

	}

}
