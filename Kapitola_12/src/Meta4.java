import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Deklarace typu anotace
@Retention(RetentionPolicy.RUNTIME)
@interface MojeAnotace4 {
	String str() default "Testovani";
	int val() default 9000;
}

class Meta4 {

	// Prirazeni anotace k metode s vyuzitim vychozich hodnot
	@MojeAnotace4 ()
	public static void mojeMetoda() {
		Meta4 ob = new Meta4();
		
		// Ziskani anotace prirazene k teto metode
		// a zobrazeni hodnot jejich clenu.
		
		try {
			Class<?> c = ob.getClass();

			Method m = c.getMethod("mojeMetoda");
			
			MojeAnotace4 anno = m.getAnnotation(MojeAnotace4.class);
			
			System.out.println(anno.str() + " " + anno.val());
		}
		catch (NoSuchMethodException exc) {
			System.out.println("Dana metoda nebyla nalezena");
				
		}
	}
	
	
	public static void main(String[] args) {
		mojeMetoda();

	}

}
