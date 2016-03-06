import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Ukazka prace s reflexi.
public class ReflectionDemo1 {

	public static void main(String[] args) {
		
		try {
			Class<?> c = Class.forName("java.awt.Dimension");
			
			System.out.println("Konstruktory: ");
			Constructor constructors[] = c.getConstructors();
			for(int i=0; i < constructors.length; i++) {
				System.out.println(" " + constructors[i]);
			}
			System.out.println();
			
			System.out.println("Pole: ");
			Field fields[] = c.getFields();
			for(int i=0; i < fields.length; i++) {
				System.out.println(" " + fields[i]);
			}
			System.out.println();
			
			System.out.println("Metody: ");
			Method methods[] = c.getMethods();
			for(int i=0; i < methods.length; i++) {
				System.out.println(" " + methods[i]);
			}
			System.out.println();
			
		} catch (Exception e) {
			System.out.println("Zachycena vyjimka: " + e);
		}

	}

}
