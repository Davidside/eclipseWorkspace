// Nahrada podretezce
class StringReplace {

	public static void main(String[] args) {
		String org = "Toto jest test. Toto jest, take.";
		String search = "est";
		String sub = "byl";
		String result = org;
		
		int i;
		do { // nahrada vsech odpovidajicich podretezcu
			System.out.println(result);
			i = result.indexOf(search);
			if (i != -1) {
				result = result.substring(0, i);
				result = result + sub;
				result = result + org.substring(i + search.length());
			}
		} while(i != -1);
		

	}

}
