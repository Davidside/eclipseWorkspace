import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Maly editor
class TinyEdit {

	public static void main(String[] args) throws IOException {
		// vytvoreni proudu BufferedReader, pripojeneho k System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = new String[100];
		System.out.println("Zadavejte radky textu");
		System.out.println("Program ukoncete zadanim slova 'stop'.");
		
		for(int i=0; i < 100; i++) {
			str[i] = br.readLine();
			if (str[i].equals("stop")) {
				break;
			}
		}

		System.out.println("\nNize nasleduji vami zadane radky:");
		// zobrazeni radku textu
		for (int i=0; i<100; i++) {
			if(str[i].equals("stop")) {
				break;
			}
			System.out.println(str[i]);
		}
	}

}
