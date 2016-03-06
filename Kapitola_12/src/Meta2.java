import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Deklarace typu anotace
@Retention(RetentionPolicy.RUNTIME)
@interface MojeAnotace2 {
	String str();
	int val();
}

class Meta2 {

	// Metoda mojeMetoda ma nyni dva parametry
	@MojeAnotace2(str = "Metoda se dvema parametry", val = 19)
	public static void mojeMetoda(String str, int i) {
		Meta2 ob = new Meta2();
		
		
		try {

			Class<?> c = ob.getClass();
			
			// Zde je nutne zadat typy parametru.
			Method m = c.getMethod("mojeMetoda", String.class, int.class);
			
			MojeAnotace2 anno = m.getAnnotation(MojeAnotace2.class);
			
			System.out.println(anno.str() + " " + anno.val());
		}
		
		
		catch (NoSuchMethodException exc) {
			System.out.println("Dana metoda nebyla nalezena");
				
		}
	}
	
	
	public static void main(String[] args) {
		mojeMetoda("test", 10);

	}

}
