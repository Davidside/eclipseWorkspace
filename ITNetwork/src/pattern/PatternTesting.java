package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTesting {
	public static void main(String args[]) {
		Pattern pattern = Pattern.compile("^[A-Z][a-z]* [A-Z][a-z]*$");
		Matcher matcher = pattern.matcher("Kral Novakovic");
		
		if(matcher.find()) {
			System.out.println("Shoda nalezena!");
		}
		else {
			System.out.println("Shoda NEnalezena!");
		}
		
		pattern = Pattern.compile(" ?\\w+\\.[jJ][pP][gG] ?");
		matcher = pattern.matcher("adasd.jpg   */+AS568_DS.jpg asdwqe as 547 asdad.jpg   588sdf fdsfew5 f9wr asd.JpG");
				
		while(matcher.find()) {
			String str = matcher.group();
			str = str.trim();
			System.out.println(str);
		}
		
		pattern = Pattern.compile("('(''|[^'])*'|\\d+)(\\s*,\\s*('(''|[^'])*'|\\d+))*");
		matcher = pattern.matcher("dfgdsgd      sf fdaf wr  FSADF Wfasdf 'g''68', 56584 ,  'adfwer586 ',  5896fasdfew 895asdf we");
		
		if(matcher.find()) {
			System.out.println("Shoda nalezena!" + matcher.group());
		}
		else {
			System.out.println("Shoda NEnalezena!");
		}
		
	}
}
