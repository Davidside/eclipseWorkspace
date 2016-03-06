package IFExtemd;

// Jedno rozhrani muze byt rozsirenim druheho
interface A {
	void meth1();
	void meth2();
}

// Rozhrani B nyni obsahuje metody meth1() a meth2() a pridava metodu meth3().
interface B extends A {
	void meth3();
}

// Tato trida musi implementovat vsechny metody rozhrani A i B
class MyClass implements B {
	public void meth1() {
		System.out.println("Implementace metody meth1().");
	}
	
	public void meth2() {
		System.out.println("Implementace metody meth2().");
	}
	
	public void meth3() {
		System.out.println("Implementace metody meth3().");
	}
}


class IFExtend {
	public static void main(String[] args) {
		MyClass ob = new MyClass();
		
		ob.meth1();
		ob.meth2();
		ob.meth3();
	}

}
