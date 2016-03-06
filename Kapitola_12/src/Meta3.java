// Zobrazeni vsech anotaci tridy a metody.
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.RUNTIME)
@interface MojeAnotace3 {
	String str();
	int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface DruhaAnotace {
	String description();
}

@DruhaAnotace(description = "Trida pro testovani anotace")
@MojeAnotace3(str = "Meta3", val = 99)
class Meta3 {

	@DruhaAnotace(description = "Metoda pro testovani anotace")
	@MojeAnotace3(str = "Testovani", val = 100)
	public static void mojeMetoda() {
		Meta3 ob = new Meta3();
		
		
		try {

			Annotation annos[] = ob.getClass().getAnnotations();
			
			// Zobrazeni vsech anotaci tridy Meta3
			System.out.println("Vsechny anotace tridy Meta3:");
			for(Annotation a : annos) {
				System.out.println(a);
			}
			
			System.out.println();
			
			// zobrazeni vsech anotaci metody mojeMetoda
			
			Method m = ob.getClass().getMethod("mojeMetoda");
			
			annos = m.getAnnotations();
			
			// Zobrazeni vsech anotaci metody mojeMetoda
			System.out.println("Vsechny anotace metody mojeMetoda:");
			for(Annotation a : annos) {
				System.out.println(a);
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
