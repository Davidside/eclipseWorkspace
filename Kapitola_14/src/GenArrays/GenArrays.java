package GenArrays;

// Genericke typy a pole.
class Gen<T extends Number> {
	T ob;
	
	T vals[]; // OK
	
	Gen(T o, T[] nums) {
		ob = o;
		
		// Tento prikaz neni platny.
		// vals = new T[10]; // nelze vytvorit pole typu T
		
		// Avsak tento prikaz je naprosto spravny
		vals = nums; // Je mozne priradit odkaz existujicimu poli
	}
}

class GenArrays {

	public static void main(String[] args) {
		Integer n[] = { 1, 2, 3, 4, 5 };
		
		Gen<Integer> iOb = new Gen<Integer>(50, n);
		
		// Nelze vytvorit pole typove specifickych generickych odkazu.
		// Gen<Integer> gens[] = new Gen<Integer>[10]; // Chyba!
		
		// Avsak tento prikaz je naprosto spravny..
		Gen<?> gens[] = new Gen<?>[10]; // OK

	}

}
