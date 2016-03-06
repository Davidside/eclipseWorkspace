// Ukazka pouziti metod length a capacity tridy StringBuffer.
class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Ahoj");
		
		System.out.println("Obsah objektu StringBuffer = " + sb);
		System.out.println("Delka retezce v objektu StringBuffer = " + sb.length());
		System.out.println("Kapacita objektu StringBuffer = " + sb.capacity());

	}

}
