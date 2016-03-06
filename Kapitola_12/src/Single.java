import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Jednclenna anotace
@Retention(RetentionPolicy.RUNTIME)
@interface MojeJednoclennaAnotace { 
	int value(); // nazev teto promenne musi byt value
}

class Single {

	// Prirazeni jednoclenne anotace k metode.
	@MojeJednoclennaAnotace(100)
	public static void mojeMetoda() {
		Single ob = new Single();
		
		
		try {

			Method m = ob.getClass().getMethod("mojeMetoda");
			
			MojeJednoclennaAnotace anno = m.getAnnotation(MojeJednoclennaAnotace.class);
			
			System.out.println(anno.value()); // zobrazi se hodnota 100
			

		}
		catch (NoSuchMethodException exc) {
			System.out.println("Dana metoda nebyla nalezena");
				
		}
	}
	
	
	public static void main(String[] args) {
		mojeMetoda();

	}

}
