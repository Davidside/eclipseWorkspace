// Ukazka prace s operatorem instanceof

class A {
	int i, j;
	}

class B {
	int i, j;
}

class C extends A {
	int k;
}

class D extends A {
	int k;
}

class InstanceOf {

	public static void main(String[] args) {
		A a = new A();
		B b = new B ();
		C c = new C ();
		D d = new D ();
		
		if(a instanceof A) {
			System.out.println("a je instanci typu A");
		}
		if(b instanceof B) {
			System.out.println("b je instanci typu B");
		}
		if(c instanceof C) {
			System.out.println("c je instanci typu C");
		}
		if(c instanceof A) {
			System.out.println("c lze pretypovat na typ A");
		}
		if(a instanceof C) {
			System.out.println("a lze pretypovat na typ C");
		}
		
		System.out.println();

		// porovnani typu odvozenych typu
		A ob;
		
		ob = d; // odkaz na d
		System.out.println("ob se nyni odkazuje na d");
		
		if(ob instanceof D) {
			System.out.println("ob je instanci typu D");
		}
		
		System.out.println();
		
		ob = c; // odkaz na c
		System.out.println("ob se nyni odkazuje na c");
		
		if(ob instanceof D) {
			System.out.println("ob lze pretypovat na typ D");
		}
		else {
			System.out.println("ob nelze pretypovat na typ D");
		}
		
		if(ob instanceof A) {
			System.out.println("ob lze pretypovat na typ A");
		}
		
		System.out.println();
		
		// vsechny objekty lze pretypovat na typ Object
		if(a instanceof Object) {
			System.out.println("a lze pretypovat na typ Object");
		}
		if(b instanceof Object) {
			System.out.println("b lze pretypovat na typ Object");
		}
		if(c instanceof Object) {
			System.out.println("c lze pretypovat na typ Object");
		}
		if(d instanceof Object) {
			System.out.println("d lze pretypovat na typ Object");
		}
		
	}

}
