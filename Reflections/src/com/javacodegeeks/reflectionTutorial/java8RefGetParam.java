import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class java8RefGetParam {

	public static void main(String[] args) {
		Class<String> stringClass = String.class;
		
		for (Method methodStringClass : stringClass.getDeclaredMethods()) {
			System.out.println("Method " + methodStringClass.getName());
			for (Parameter paramMethodStringClass : methodStringClass.getParameters()) {
				System.out.println(" Parameter name " + paramMethodStringClass.getName());
				System.out.println(" Parameter type " + paramMethodStringClass.getType());
				
			}
			
		}

	}

}
