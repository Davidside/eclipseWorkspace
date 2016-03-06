class getCharsDemo {

	public static void main(String[] args) {
		String s = "Toto je ukazka metody getChars().";
		int zacatek = 8;
		int konec = 14;
		char buf[] = new char[konec - zacatek];
		
		s.getChars(zacatek, konec, buf, 0);
		System.out.println(buf);

	}

}
