// Priklad genetickeho rozhrani.

// Rozhrani MinMax
interface MinMax<T extends Comparable<T>> {
	T min();
	T max();
}

// Implementace rozhrani MinMax.
class MyClass<T extends Comparable<T>> implements MinMax<T> {
	T[] vals;
	
	MyClass(T[] o) {
		vals = o;
	}
	
	// Vraceni minimalni hodnoty pole vals.
	public T min() {
		T v = vals[0];
		
		for(int i=0; i < vals.length; i++) {
			if(vals[i].compareTo(v) < 0) {
				v = vals[i];
			}
		}
		return v;
	}
	
	// Vraceni maximalni hodnoty pole vals.
		public T max() {
			T v = vals[0];
			
			for(int i=0; i < vals.length; i++) {
				if(vals[i].compareTo(v) > 0) {
					v = vals[i];
				}
			}
			return v;
		}
}

class GenIFDemo {

	public static void main(String[] args) {
		Integer inums[] = { 3, 6, 2, 8, 6 };
		Character chs[] = {'b', 'r', 'p', 'w' };
		
		MyClass<Integer> iob = new MyClass<Integer>(inums);
		MyClass<Character> cob = new MyClass<Character>(chs);
		
		System.out.println("Maximalni hodnota pole inums: " + iob.max());
		System.out.println("Minimalni hodnota pole inums: " + iob.min());
		
		System.out.println("Maximalni hodnota pole chs: " + cob.max());
		System.out.println("Minimalni hodnota pole chs: " + cob.min());

	}

}
