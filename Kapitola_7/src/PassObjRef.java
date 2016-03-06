// Objekty jsou predavany prostrednictvim odkazu

class Test3 {
	int a, b;
	
	Test3(int i, int j) {
		a = i;
		b = j;
	}
	
	// predani objektu
	void meth(Test3 o) {
		o.a *= 2;
		o.b /= 2;
	}
}

class PassObjRef {

	public static void main(String[] args) {
		Test3 ob = new Test3(15, 20);
		
		System.out.println("Hodnoty ob.a a ob.b pred volanim: " + ob.a + " " + ob.b);
		
		ob.meth(ob);
		
		System.out.println("Hodnoty ob.a a ob.b po volani: " + ob.a + " " + ob.b);
	}

}
