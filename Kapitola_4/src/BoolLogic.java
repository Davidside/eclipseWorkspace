// Ukazka prace s bitovymi logickymi operatory.
class BoolLogic {

	public static void main(String[] args) {
		boolean a = true; 
		boolean b = false; 
		boolean c = a | b;
		boolean d = a & b;
		boolean e = a ^ b;
		boolean f = (!a & b)|(a & !b);
		boolean g = !a;
		
		System.out.println("Hodnota a = " + a);
		System.out.println("Hodnota b = " + b);
		System.out.println("Hodnota c = " + c);
		System.out.println("Hodnota d = " + d);
		System.out.println("Hodnota e = " + e);
		System.out.println("Hodnota f = " + f);
		System.out.println("Hodnota g = " + g);

	}

}
