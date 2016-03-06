// Ukazka pouziti vice prikazu catch
class MultipleCatches {
	public static void main(String[] args) {
		try {
			int a = args.length;
			System.out.println("a = " + a);
			int b = 42 / a;
			int c[] = { 1 };
			c[42] = 99;
		}
		
		catch(ArithmeticException e) {
			System.out.println("Deleni nulou: " + e);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index pole mimo rozsah: " + e);
		}
		
		System.out.println("Po bloku try/catch.");

	}

}
