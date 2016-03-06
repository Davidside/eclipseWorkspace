// Ukazka pouziti statickeho importu pro zviditelneni metod sqrt() a pow()
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

// Vypocet delky prepony pravouhleho trojuhelnika.
class Prepona2 {

	public static void main(String[] args) {
		double strana1, strana2;
		double prepona;
		strana1 = 3.0;
		strana2 = 4.0;
		
		// V tomto pripade lze metody sqrt() a pow() volat primo,
		// bez nutnosti zadavani nazvu jejich tridy.
		prepona = sqrt(pow(strana1, 2) + pow(strana2, 2));
		
		System.out.println("Pravouhly trojuhelnik se stranami " + strana1 + " a " + strana2 + 
						   " ma preponu o delce " + prepona);

	}

}
