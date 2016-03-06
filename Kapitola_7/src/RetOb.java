// Ukazka vraceni objektu
class Test4 {
	int a;

	Test4 (int i) {
		a = i;
	}
	
	Test4 incrByTen () {
		Test4 temp = new Test4(a+10);
		return temp;
	}
}

class RetOb {
	public static void main(String[] args) {
		Test4 ob1 = new Test4(2);
		Test4 ob2;
		
		ob2 = ob1.incrByTen();
		
		System.out.println("Hodnota ob1.a: " + ob1.a);
		System.out.println("Hodnota ob2.a: " + ob2.a);
		
		ob2 = ob2.incrByTen();
		System.out.println("Hodnota ob2.a po druhem navyseni: " + ob2.a);

	}

}
