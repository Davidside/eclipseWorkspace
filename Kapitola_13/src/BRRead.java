import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Pouziti proudu typu BufferedReader ke cteni znaku z konzoly.
class BRRead {

	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Zadavejte znaky, klavesou 'q' program ukoncete");
		
		// cteni znaku
		do {
			c = (char) br.read();
			System.out.println(c);
		} while(c != 'q');

	}

}
