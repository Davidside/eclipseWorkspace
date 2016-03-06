import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Deklarace typu anotace
@Retention(RetentionPolicy.RUNTIME)
@interface MojeAnotace {
	String str();
	int val();
}

class Meta {

	// Anotace metody
	@MojeAnotace(str = "Priklad anotace", val = 100)
	public static void mojeMetoda() {
		Meta ob = new Meta();
		
		// Nacteni anotace teto metody
		// a zobrazeni hodnot jejich clenu.
		
		try {
			// Nejprve je nutne ziskat objekt typu Class
			// predstavujici tuto tridu
			Class<?> c = ob.getClass();
			
			// Nyni je mozne nacist objekt typu Method
			// predstavujici  danou metodu.
			Method m = c.getMethod("mojeMetoda");
			
			// Pote je mozne nacist anotace teto metody.
			MojeAnotace anno = m.getAnnotation(MojeAnotace.class);
			
			// A nakonec je mozne ziskane hodnoty zobrazit.
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
