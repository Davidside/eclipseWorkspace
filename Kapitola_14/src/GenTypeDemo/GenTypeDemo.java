package GenTypeDemo;

// V tomto pripade je T standardne omezeno typem Object.
class Gen<T> {
	T ob; // typovy parametr T bude nahrazen typem Object
	
	Gen(T o) {
		ob = o;
	}
	
	// Vraceni ob.
	T getob() {
		return ob;
	}
}

// V tomto pripade je T omezeno Typem String.
class GenStr<T extends String> {
	T str; // typovy parametr T bude nahrazen typem String
	
	GenStr(T o) {
		str = o;
	}

	T getstr() {
		return str;
	}
}

// Ukazka pouziti prekryte genericke metody.
class GenTypeDemo {

	public static void main(String[] args) {
		
		Gen<Integer> iOb = new Gen<Integer>(99);
		Gen<Float> fOb = new Gen<Float>(102.2F);
		GenStr<String> strOb = new GenStr<String>("Test generickych trid");
		
		System.out.println(iOb.getClass().getName());
		System.out.println(fOb.getClass().getName());
		System.out.println(strOb.getClass().getName());
		
	}

}
