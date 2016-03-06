import java.util.ArrayDeque;

// Ukazka vyuziti tridy ArrayDeque.
public class ArrayDequeDemo {

	public static void main(String[] args) {
		// Vytvoreni oboustranne fronty.
		ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
		
		// Vyuziti instace oboustranne fronty jako zasobniku.
		arrayDeque.push("A");
		arrayDeque.push("B");
		arrayDeque.push("D");
		arrayDeque.push("E");
		arrayDeque.push("F");
		
		System.out.print("Odebirani prvku ze zasobniku: ");
		while(arrayDeque.peek() != null) {
			System.out.print(arrayDeque.pop() + " ");
		}
		
		System.out.println();

	}

}
