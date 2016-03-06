import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Znackovaci anotace
@Retention(RetentionPolicy.RUNTIME)
@interface MojeZnacka { }

class Marker {

	// Prirazeni znackovaci anotace k metode.
	// Vsimnete si, ze neni nutne pouziti zavorek ( ).
	@MojeZnacka
	public static void mojeMetoda() {
		Marker ob = new Marker();
		
		
		try {

			Method m = ob.getClass().getMethod("mojeMetoda");
			
			// Zjisteni, zda je ci neni anotace prirazena
			if(m.isAnnotationPresent(MojeZnacka.class)) {
				System.out.println("Anotace MojeZnacka je prirazena");
			}
			

		}
		catch (NoSuchMethodException exc) {
			System.out.println("Dana metoda nebyla nalezena");
				
		}
	}
	
	
	public static void main(String[] args) {
		mojeMetoda();

	}

}
