// Vypocet delky prepony pravouhleho trojuhelnika.
class Prepona {

	public static void main(String[] args) {
		double strana1, strana2;
		double prepona;
		strana1 = 3.0;
		strana2 = 4.0;
		
		// Vsimnete si, ze metody sqrt() a pow() je nutne
		// kvalifikovat nazvem jejich tridy, kterou je Math.
		prepona = Math.sqrt(Math.pow(strana1, 2) + Math.pow(strana2, 2));
		
		System.out.println("Pravouhly trojuhelnik se stranami " + strana1 + " a " + strana2 + 
						   " ma preponu o delce " + prepona);

	}

}
