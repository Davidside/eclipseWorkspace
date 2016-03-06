// Jednoduchy priklad pracujici s nativni metodou.
public class NativeDemo {
	int i;

	public static void main(String[] args) {
		NativeDemo ob = new NativeDemo();
		
		ob.i = 10;
		System.out.println("Hodnota ob.i pred volanim nativni metody: " + ob.i);
		ob.test(); // volani nativni metody
		System.out.println("Hodnota ob.i po volani nativni metody: " + ob.i);
	}
	
	// deklarace nativni metody
	public native void test();
	// nacteni DLL knihovny obsahujici statickou metodu
	static {
		System.loadLibrary("NativeDemo");
	}
	

}
