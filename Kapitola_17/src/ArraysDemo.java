import java.util.Arrays;

// Ukazka pouziti metod tridy Arrays
public class ArraysDemo {

	public static void main(String[] args) {

		// Alokace a inicializace pole
		int array[] = new int[10];
		for(int i = 0; i < array.length; i++) {
			array[i] = -3 * i;
		}
		
		// Zobrazeni, serazeni a opetovne zobrazeni pole.
		System.out.print("Puvodni obsah pole: ");
		display(array);
		Arrays.sort(array);
		System.out.print("Obsah pole po pouziti metody sort(): ");
		display(array);
		
		// Vyplneni pole a zobrazeni jeho obsahu.
		Arrays.fill(array, 2, 6, -1);
		System.out.print("Obsah pole po pouziti metody sort|(): ");
		display(array);
		
		// Opetovne serazeni a zobrazeni pole.
		Arrays.sort(array);
		System.out.print("Obsah pole po opetovnem  pouziti metody sort(): ");
		display(array);
		
		// Binarni hledani hodnoty -9.
		System.out.print("Hodnota -9 se nachazi na pozici ");
		int index = Arrays.binarySearch(array, -9);
		System.out.println(index);
		
		// Binarni hledani hodnoty -1.
		// If the array contains multiple elements with the 
		// specified value, there is no guarantee which one 
		// will be found.
		System.out.print("Hodnota -1 se nachazi na pozici ");
		index = Arrays.binarySearch(array, -1);
		System.out.println(index);

	}
	
	static void display(int array[]) {
		for(int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
