// Ukazka pouziti metod charAt() a setCharAt90.
class setCharAtDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		
		System.out.println("Objekt StringBuffer pred upravou = " + sb);
		System.out.println("Znak na pozici 1 /charAt(1)/ pred upravou = " + sb.charAt(1));
		
		sb.setCharAt(1, 'i');
		sb.setLength(2);
		
		System.out.println("Objekt StringBuffer po uprave = " + sb);
		System.out.println("Znak na pozici 1 /charAt(1)/ po uprave = " + sb.charAt(1));

	}

}
