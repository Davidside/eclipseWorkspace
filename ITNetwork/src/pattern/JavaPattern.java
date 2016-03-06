package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaPattern {
	
	public static void main(String args[]) {
		Pattern p = Pattern.compile("^\\d{3} ?\\d{2}$");
		String str = "158 00";
		System.out.println(str);
		
		Matcher m = p.matcher(str);
		
		if(m.find()) {
			System.out.println("Vyraz splnuje pravidla");
		}
		else {
			System.out.println("Vyraz nesplnuje pravidla");
		}
	}
}
