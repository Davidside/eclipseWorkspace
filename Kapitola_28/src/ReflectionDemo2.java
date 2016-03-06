import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

// Zobrazeni verejnych metod.
public class ReflectionDemo2 {

	public static void main(String[] args) {
		try {
			A a = new A();
			Class<?> c = a.getClass();
			
			System.out.println("Verejne metody");
			Method methods[] = c.getDeclaredMethods();
			
			for(int i = 0; i < methods.length; i++) {
				int modifiers = methods[i].getModifiers();
				
				if(Modifier.isPublic(modifiers)) {
					System.out.println(" " + methods[i].getName());
				}
				
			}
		}
		catch (Exception e) {
			System.out.println("Zachycena vyjimka: " + e);
		}
		
	}

}

class A {
	public void a1() {
		
	}
	
	public void a2() {
		
	}
	
	protected void a3() {
		
	}
	
	private void a4() {
		
	}
}
