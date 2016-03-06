package Stack;

class IFTest2 {

	public static void main(String[] args) {
		DynStack mystack1 = new DynStack(5);
		DynStack mystack2 = new DynStack(8);
		
		// v techto smyckach dochazi ke zvetsovani kazdeho zasobniku
		for(int i=0; i<12; i++) mystack1.push(i);
		for(int i=0; i<20; i++) mystack2.push(i);
		
		//odebrani techto cisel ze zasobniku
		System.out.println("Hodnoty v zasobniku mystack1:");
		for(int i=0; i<12; i++)
			System.out.println(mystack1.pop());
		
		System.out.println("Hodnoty v zasobniku mystack2:");
		for(int i=0; i<20; i++)
			System.out.println(mystack2.pop());

	}

}
